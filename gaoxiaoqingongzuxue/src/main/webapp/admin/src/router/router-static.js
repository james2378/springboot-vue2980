import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import dictionary from '@/views/modules/dictionary/list'
    import gongsi from '@/views/modules/gongsi/list'
    import jianli from '@/views/modules/jianli/list'
    import news from '@/views/modules/news/list'
    import pinkuensjhengshenqing from '@/views/modules/pinkuensjhengshenqing/list'
    import toudi from '@/views/modules/toudi/list'
    import yonghu from '@/views/modules/yonghu/list'
    import zhaopin from '@/views/modules/zhaopin/list'
    import zhaopinCollection from '@/views/modules/zhaopinCollection/list'
    import zhaopinLiuyan from '@/views/modules/zhaopinLiuyan/list'
    import config from '@/views/modules/config/list'
    import dictionaryHanye from '@/views/modules/dictionaryHanye/list'
    import dictionaryJianli from '@/views/modules/dictionaryJianli/list'
    import dictionaryNews from '@/views/modules/dictionaryNews/list'
    import dictionaryPinkuensjhengshenqingYesnoText from '@/views/modules/dictionaryPinkuensjhengshenqingYesnoText/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryShangpinCollection from '@/views/modules/dictionaryShangpinCollection/list'
    import dictionaryShangxia from '@/views/modules/dictionaryShangxia/list'
    import dictionaryShenfen from '@/views/modules/dictionaryShenfen/list'
    import dictionaryToudiYesno from '@/views/modules/dictionaryToudiYesno/list'
    import dictionaryZhaopin from '@/views/modules/dictionaryZhaopin/list'
    import dictionaryZhaopinCollection from '@/views/modules/dictionaryZhaopinCollection/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryHanye',
        name: '所在行业',
        component: dictionaryHanye
    }
    ,{
        path: '/dictionaryJianli',
        name: '求职意向',
        component: dictionaryJianli
    }
    ,{
        path: '/dictionaryNews',
        name: '公告信息类型',
        component: dictionaryNews
    }
    ,{
        path: '/dictionaryPinkuensjhengshenqingYesnoText',
        name: '审核结果',
        component: dictionaryPinkuensjhengshenqingYesnoText
    }
    ,{
        path: '/dictionarySex',
        name: '性别',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryShangpinCollection',
        name: '收藏表类型',
        component: dictionaryShangpinCollection
    }
    ,{
        path: '/dictionaryShangxia',
        name: '是否上架',
        component: dictionaryShangxia
    }
    ,{
        path: '/dictionaryShenfen',
        name: '身份',
        component: dictionaryShenfen
    }
    ,{
        path: '/dictionaryToudiYesno',
        name: '审核结果',
        component: dictionaryToudiYesno
    }
    ,{
        path: '/dictionaryZhaopin',
        name: '招聘岗位',
        component: dictionaryZhaopin
    }
    ,{
        path: '/dictionaryZhaopinCollection',
        name: '收藏表类型',
        component: dictionaryZhaopinCollection
    }
    ,{
        path: '/config',
        name: '轮播图',
        component: config
    }


    ,{
        path: '/dictionary',
        name: '字典表',
        component: dictionary
      }
    ,{
        path: '/gongsi',
        name: '公司',
        component: gongsi
      }
    ,{
        path: '/jianli',
        name: '简历',
        component: jianli
      }
    ,{
        path: '/news',
        name: '公告信息',
        component: news
      }
    ,{
        path: '/pinkuensjhengshenqing',
        name: '贫困生申请',
        component: pinkuensjhengshenqing
      }
    ,{
        path: '/toudi',
        name: '简历投递',
        component: toudi
      }
    ,{
        path: '/yonghu',
        name: '用户',
        component: yonghu
      }
    ,{
        path: '/zhaopin',
        name: '职位招聘',
        component: zhaopin
      }
    ,{
        path: '/zhaopinCollection',
        name: '职位收藏',
        component: zhaopinCollection
      }
    ,{
        path: '/zhaopinLiuyan',
        name: '职位留言',
        component: zhaopinLiuyan
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
