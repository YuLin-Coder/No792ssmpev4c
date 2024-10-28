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
    import weishengyuan from '@/views/modules/weishengyuan/list'
    import caigoudingdan from '@/views/modules/caigoudingdan/list'
    import yaopingongyingshang from '@/views/modules/yaopingongyingshang/list'
    import weishengshi from '@/views/modules/weishengshi/list'
    import yaopinxinxi from '@/views/modules/yaopinxinxi/list'
    import peisongdingdan from '@/views/modules/peisongdingdan/list'
    import quyuxinxi from '@/views/modules/quyuxinxi/list'
    import jiesuandingdan from '@/views/modules/jiesuandingdan/list'
    import weishengju from '@/views/modules/weishengju/list'
    import tuihuodingdan from '@/views/modules/tuihuodingdan/list'


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
    }
      ,{
	path: '/weishengyuan',
        name: '卫生院',
        component: weishengyuan
      }
      ,{
	path: '/caigoudingdan',
        name: '采购订单',
        component: caigoudingdan
      }
      ,{
	path: '/yaopingongyingshang',
        name: '药品供应商',
        component: yaopingongyingshang
      }
      ,{
	path: '/weishengshi',
        name: '卫生室',
        component: weishengshi
      }
      ,{
	path: '/yaopinxinxi',
        name: '药品信息',
        component: yaopinxinxi
      }
      ,{
	path: '/peisongdingdan',
        name: '配送订单',
        component: peisongdingdan
      }
      ,{
	path: '/quyuxinxi',
        name: '区域信息',
        component: quyuxinxi
      }
      ,{
	path: '/jiesuandingdan',
        name: '结算订单',
        component: jiesuandingdan
      }
      ,{
	path: '/weishengju',
        name: '卫生局',
        component: weishengju
      }
      ,{
	path: '/tuihuodingdan',
        name: '退货订单',
        component: tuihuodingdan
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
