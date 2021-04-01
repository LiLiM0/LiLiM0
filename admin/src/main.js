import Vue from 'vue'
import App from './app.vue'
import router from './router'
import axios from "axios";

Vue.config.productionTip = false
//Vue.prototype.XXXX Vue组件的全局变量 可以在任意Vue组件中用this.xxx来获取这个值
Vue.prototype.$ajax = axios;

new Vue({
    router,
    render: h => h(App),
}).$mount('#app');
