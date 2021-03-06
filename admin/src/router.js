import Vue from "vue"
import Router from "vue-router"
import Login from "./views/login.vue"
import Admin from "./views/admin.vue"
import Welcome from "./views/admin/welcome.vue"
import Category from "./views/admin/category.vue"
import Course from "./views/admin/course.vue"
import Chapter from "./views/admin/chapter.vue"
import Section from "./views/admin/section.vue"
import Teacher from "./views/admin/teacher.vue"
import File from "./views/admin/file.vue"
import Content from "./views/admin/content.vue"


Vue.use(Router);

export default new Router({
    mode: "history",
    base: process.env.BASE_URL,
    routes: [{
        // 无论在地址栏中输入什么都会跳转到/login
        path: "*",
        redirect: "/login",
    }, {
        path: "/login",
        component: Login
    }, {
        path: "/",
        name:"admin",
        component: Admin,
        //admin下面的子路由,子路由path路径不加/
        children:[{
            path: "welcome",
            name:"welcome",
            component: Welcome
        }, {
            path: "business/category",
            name:"business/category",
            component: Category
        },{
            path: "business/course",
            name:"business/course",
            component: Course
        }, {
            path: "business/chapter",
            name:"business/chapter",
            component: Chapter
        }, {
            path: "business/section",
            name:"business/section",
            component: Section
        }, {
            path: "business/content",
            name:"business/content",
            component: Content
        }, {
            path: "business/teacher",
            name:"business/teacher",
            component: Teacher
        }, {
            path: "file/file",
            name:"file/file",
            component: File
        }]
    }]
})