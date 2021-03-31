import Vue from 'vue'
import Router from 'vue-router'
import Login from './views/login.vue'
import Admin from './views/admin.vue'
import Welcome from './views/admin/welcome.vue'

Vue.use(Router);

export default new Router({
    mode: 'history',
    base: process.env.BASE_URL,
    routes: [{
        // 无论在地址栏中输入什么都会跳转到/login
        path: '*',
        redirect: "/login",
    }, {
        path: '/login',
        component: Login
    }, {
        path: '/admin',
        component: Admin,
        //admin下面的子路由,子路由path路径不加/
        children:[{
            path: 'welcome',
            component: Welcome,
        }]
    }]
})