import Vue from 'vue'
import Router from 'vue-router'
import Layout from '@/components/cmm/Layout.vue'
import Login from '@/components/member/Login.vue'
import Join from '@/components/member/Join.vue'
import Write from '@/components/board/Write.vue'
import List from '@/components/board/List.vue'
import Update from '@/components/board/Update.vue'
import Remove from '@/components/board/Remove.vue'
import Search from '@/components/board/Search.vue'
import MyPage from '@/components/member/MyPage.vue'

Vue.use(Router)

export default new Router({
	mode: 'history',
	routes:[
		{path:'/login', name:'login', component: Login},
		{path:'/join', name:'join', component: Join},
		{path:'/write', name:'write', component: Write},
		{path:'/list', name:'list', component: List},
		{path:'/update', name:'update', component: Update},
		{path:'/remove', name:'remove', component: Remove},
		{path:'/search', name:'search', component: Search},
		{path:'/myPage', name:'myPage', component: MyPage},
		{path:'/layout', name:'layout', component:Layout}
	]
})