import Vue from 'vue'
import Router from 'vue-router'
import Login from '@/components/Login'
import Navigation from '@/components/Navigation'
import DormManage from '@/components/DormManage'
import UserInfo from '@/components/UserInfo'
import Dish from '@/components/Dish'
import Order from '@/components/Order'
import UserElectricity from '@/components/UserElectricity'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: '',
      component: Login,
      hidden: true
    },
    {
      path:'/index',
      name:'俱乐部管理',
      component:Navigation,
      children:[
        {
          path:'/UserInfo',
          name:'账户管理',
          component:UserInfo,
        },
        {
          path:'/Order',
          name:'订单管理',
          component:Order,
        },
        {
          path:'/Dish',
          name:'菜单管理',
          component:Dish,
        },
        {
          path:'/DormManage',
          name:'宿舍管理',
          component:DormManage,
        },
        {
          path:'/UserElectricity',
          name:'用电管理',
          component:UserElectricity,
        }
      ]
    }
  ]
})
