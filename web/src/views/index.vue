<template>
  <main role="main">

    <section class="jumbotron text-center">
      <div class="container">
        <h1>在线视频课程平台</h1>
        <p class="lead text-muted m-3">
          知识付费时代刚刚起步，在这个领域有很多的发展机会。整个课程以实战为基础，手把手从零开始，一步一步搭建一个完整的企业级开发架构。不讲废话，只讲干货。
        </p>
        <p>
          <router-link to="/list" class="btn btn-primary my-2 p-3 font-weight-bold">点击进入所有课程</router-link>
        </p>
      </div>
    </section>

    <div class="album py-5 bg-light">
      <div class="container">
        <div class="title1">最新上线</div>
        <div class="row">
          <div v-for="n in news" class="col-md-4">
            <the-course v-bind:course="n"></the-course>
          </div>
        </div>
        <hr>
        <div class="title2">好课推荐</div>
        <div class="row">
          <div v-for="h in hots" class="col-md-4">
            <the-course v-bind:course="h"></the-course>
          </div>

          <div class="col-md-4">
            <div class="card mb-4 shadow-sm">
              <svg class="bd-placeholder-img card-img-top" width="100%" height="225"
                   xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false"
                   role="img" aria-label="Placeholder: Thumbnail"><title>Placeholder</title>
                <rect width="100%" height="100%" fill="#55595c"/>
                <text x="50%" y="50%" fill="#eceeef" dy=".3em">Thumbnail</text>
              </svg>
              <div class="card-body">
                <p class="card-text">This is a wider card with supporting text below as a natural lead-in to
                  additional content. This content is a little bit longer.</p>
                <div class="d-flex justify-content-between align-items-center">
                  <div class="btn-group">
                    <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                    <button type="button" class="btn btn-sm btn-outline-secondary">Edit</button>
                  </div>
                  <small class="text-muted">9 mins</small>
                </div>
              </div>
            </div>
          </div>

          <div class="col-md-4">
            <div class="card mb-4 shadow-sm">
              <svg class="bd-placeholder-img card-img-top" width="100%" height="225"
                   xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false"
                   role="img" aria-label="Placeholder: Thumbnail"><title>Placeholder</title>
                <rect width="100%" height="100%" fill="#55595c"/>
                <text x="50%" y="50%" fill="#eceeef" dy=".3em">Thumbnail</text>
              </svg>
              <div class="card-body">
                <p class="card-text">This is a wider card with supporting text below as a natural lead-in to
                  additional content. This content is a little bit longer.</p>
                <div class="d-flex justify-content-between align-items-center">
                  <div class="btn-group">
                    <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                    <button type="button" class="btn btn-sm btn-outline-secondary">Edit</button>
                  </div>
                  <small class="text-muted">9 mins</small>
                </div>
              </div>
            </div>
          </div>
          <div class="col-md-4">
            <div class="card mb-4 shadow-sm">
              <svg class="bd-placeholder-img card-img-top" width="100%" height="225"
                   xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false"
                   role="img" aria-label="Placeholder: Thumbnail"><title>Placeholder</title>
                <rect width="100%" height="100%" fill="#55595c"/>
                <text x="50%" y="50%" fill="#eceeef" dy=".3em">Thumbnail</text>
              </svg>
              <div class="card-body">
                <p class="card-text">This is a wider card with supporting text below as a natural lead-in to
                  additional content. This content is a little bit longer.</p>
                <div class="d-flex justify-content-between align-items-center">
                  <div class="btn-group">
                    <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                    <button type="button" class="btn btn-sm btn-outline-secondary">Edit</button>
                  </div>
                  <small class="text-muted">9 mins</small>
                </div>
              </div>
            </div>
          </div>
          <div class="col-md-4">
            <div class="card mb-4 shadow-sm">
              <svg class="bd-placeholder-img card-img-top" width="100%" height="225"
                   xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false"
                   role="img" aria-label="Placeholder: Thumbnail"><title>Placeholder</title>
                <rect width="100%" height="100%" fill="#55595c"/>
                <text x="50%" y="50%" fill="#eceeef" dy=".3em">Thumbnail</text>
              </svg>
              <div class="card-body">
                <p class="card-text">This is a wider card with supporting text below as a natural lead-in to
                  additional content. This content is a little bit longer.</p>
                <div class="d-flex justify-content-between align-items-center">
                  <div class="btn-group">
                    <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                    <button type="button" class="btn btn-sm btn-outline-secondary">Edit</button>
                  </div>
                  <small class="text-muted">9 mins</small>
                </div>
              </div>
            </div>
          </div>

          <div class="col-md-4">
            <div class="card mb-4 shadow-sm">
              <svg class="bd-placeholder-img card-img-top" width="100%" height="225"
                   xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false"
                   role="img" aria-label="Placeholder: Thumbnail"><title>Placeholder</title>
                <rect width="100%" height="100%" fill="#55595c"/>
                <text x="50%" y="50%" fill="#eceeef" dy=".3em">Thumbnail</text>
              </svg>
              <div class="card-body">
                <p class="card-text">This is a wider card with supporting text below as a natural lead-in to
                  additional content. This content is a little bit longer.</p>
                <div class="d-flex justify-content-between align-items-center">
                  <div class="btn-group">
                    <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                    <button type="button" class="btn btn-sm btn-outline-secondary">Edit</button>
                  </div>
                  <small class="text-muted">9 mins</small>
                </div>
              </div>
            </div>
          </div>
          <div class="col-md-4">
            <div class="card mb-4 shadow-sm">
              <svg class="bd-placeholder-img card-img-top" width="100%" height="225"
                   xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false"
                   role="img" aria-label="Placeholder: Thumbnail"><title>Placeholder</title>
                <rect width="100%" height="100%" fill="#55595c"/>
                <text x="50%" y="50%" fill="#eceeef" dy=".3em">Thumbnail</text>
              </svg>
              <div class="card-body">
                <p class="card-text">This is a wider card with supporting text below as a natural lead-in to
                  additional content. This content is a little bit longer.</p>
                <div class="d-flex justify-content-between align-items-center">
                  <div class="btn-group">
                    <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                    <button type="button" class="btn btn-sm btn-outline-secondary">Edit</button>
                  </div>
                  <small class="text-muted">9 mins</small>
                </div>
              </div>
            </div>
          </div>
          <div class="col-md-4">
            <div class="card mb-4 shadow-sm">
              <svg class="bd-placeholder-img card-img-top" width="100%" height="225"
                   xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false"
                   role="img" aria-label="Placeholder: Thumbnail"><title>Placeholder</title>
                <rect width="100%" height="100%" fill="#55595c"/>
                <text x="50%" y="50%" fill="#eceeef" dy=".3em">Thumbnail</text>
              </svg>
              <div class="card-body">
                <p class="card-text">This is a wider card with supporting text below as a natural lead-in to
                  additional content. This content is a little bit longer.</p>
                <div class="d-flex justify-content-between align-items-center">
                  <div class="btn-group">
                    <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                    <button type="button" class="btn btn-sm btn-outline-secondary">Edit</button>
                  </div>
                  <small class="text-muted">9 mins</small>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </main>
</template>

<script>

import TheCourse from "../components/the-course";

export default {
  name: 'index',
  components: {TheCourse},
  data: function () {
    return {
      news: [],
      hots: [],
    }
  },
  mounted() {
    let _this = this;
    _this.listNew();
    _this.listHot();
  },
  methods: {
    /**
     * 查询新上好课
     */
    listNew() {
      let _this = this;
      _this.$ajax.get(process.env.VUE_APP_SERVER + '/business/web/course/list-new').then((response) => {
        console.log("查询新上好课结果：", response);
        let resp = response.data;
        if (resp.success) {
          _this.news = resp.content;
        }
      }).catch((response) => {
        console.log("error：", response);
      })
    },

    /**
     * 查询好课推荐
     */
    listHot() {
      let _this = this;
      _this.$ajax.get(process.env.VUE_APP_SERVER + '/business/web/course/list-hot').then((response) => {
        console.log("查询好课推荐结果：", response);
        let resp = response.data;
        if (resp.success) {
          _this.hots = resp.content;
        }
      }).catch((response) => {
        console.log("error：", response);
      })
    },
  }
}
</script>

<style>
/*title 好课推荐和最新上线的标题样式 参考：https://blog.csdn.net/weixin_43226231/article/details/105321178*/
.title1 {
  background: #2B6695;
  border-radius: 6px 6px 6px 6px;
  box-shadow: 0 0 0 1px #5F5A4B, 1px 1px 6px 1px rgba(10, 10, 0, 0.5);
  color: #FFFFFF;
  font-family: "微软雅黑", "宋体", "黑体", Arial;
  font-size: 18px;
  font-weight: bold;
  height: 2.5rem;
  line-height: 25px;
  margin: 18px 0 !important;
  padding: 8px 0 5px 5px;
  text-shadow: 2px 2px 3px #222222;
}

.title2 {
  background: #2B6695;
  border-radius: 6px 6px 6px 6px;
  box-shadow: 0 0 0 1px #5F5A4B, 1px 1px 6px 1px rgba(10, 10, 0, 0.5);
  color: #FFFFFF;
  font-family: "微软雅黑", "宋体", "黑体", Arial;
  font-size: 18px;
  font-weight: bold;
  height: 2.5rem;
  line-height: 25px;
  margin: 18px 0 !important;
  padding: 8px 0 5px 5px;
  text-shadow: 2px 2px 3px #222222;
}
</style>