<template>
    <div>
        <button type="button" v-on:click="selectFile()" class="btn btn-white btn-default btn-round">
            <i class="ace-icon fa fa-upload"></i>
            {{text}}
        </button>
        <!--测试用，用于查看上传文件名 不用时hidden-->
        <input  class="hidden" type="file" ref="file" v-on:change="uploadFile()" v-bind:id="inputId+'-input'">
    </div>
</template>

<script>
    export default {
        name: 'file',
        props: {
            text: {
                default: "上传文件"
            },
            inputId: {
                default: "file-upload"
            },
            suffixs: {
                default: []
            },
            use: {
                default: ""
            },
            afterUpload: {
                type: Function,
                default: null
            },
        },
        data: function () {
            return {}
        },
        methods: {
            uploadFile() {
                let _this = this;
                let formData = new window.FormData();
                let file = _this.$refs.file.files[0];

                let suffixs = _this.suffixs;//支持格式
                let fileName = file.name;//文件名
                let suffix = fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length).toLowerCase();//后缀
                let validateSuffix = false;//验证flag
                for (let i = 0; i < suffixs.length; i++) {
                    if (suffixs[i].toLowerCase() === suffix) {
                        validateSuffix = true;
                        break;
                    }
                }
                if (!validateSuffix) {
                    Toast.warning("文件格式不正确！只支持上传：" + suffixs.join(","));
                    //清空无效格式文件路径
                    $("#" + _this.inputId + "-input").val("");
                    return;
                }
                //key:"file"必须和后端controller参数名一致
                formData.append('file', file);
                formData.append('use', _this.use);
                Loading.show();
                _this.$ajax.post(process.env.VUE_APP_SERVER + '/file/admin/upload',
                    formData).then((response) => {
                    Loading.hide();
                    let resp = response.data;
                    console.log("上传文件成功：", resp);
                    _this.afterUpload(resp);
                    //清空无效格式文件路径
                    $("#" + _this.inputId + "-input").val("");
                });
            },

            selectFile() {
                let _this = this;
                $("#" + _this.inputId + "-input").trigger("click");
            }
        }
    }
</script>
