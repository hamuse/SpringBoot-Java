<template>
	<div id="app">
	<layout>
		<template #header="header">
			<h1>{{header.title}}</h1>
			<!-- <img alt="Vue logo" src="./assets/logo.png"> -->
			<div id="divid">
				<button v-for="i of buttn" :key= "i.btn">
				<router-link :to="i.link">{{i.btn}}</router-link>
				</button>
			</div>
		</template>
		<template #sidebar="sidebar">  <!-- 사이더바에 메뉴 만들기 -->
		<ul class="menu">
			<li v-for="i of sidebars" :key= "i.menu">
			<router-link :to="i.link">{{i.menu}}</router-link>
			</li>
		</ul>
		</template>
		<template #content="content">
			<h1>{{content.title}}</h1>
			<router-view></router-view>
		</template>
		<template #footer="footer">
		<h1>{{footer.title}}</h1>
		</template>
	</layout>
	</div>
</template>
<script>
import Layout from '@/components/cmm/Layout.vue'
export default {
	name : "homeApp",
	components: {Layout},
	data(){
		return { 
			sidebars: [
				{menu: "글쓰기", link: "/write"},
				{menu: "목록", link: "/list"},
				{menu: "글수정", link: "/update"},
				{menu: "글삭제", link: "/remove"},
				{menu: "검색", link: "/search"}
			],
			buttn:[
				{btn: "로그인", link:"/login"},
				{btn: "회원가입", link:"/join"}
			]
		}
	},
	methods : {
		login(){
			alert('로그인 클릭 ')
		}
	},
}
</script>
<style scoped>
#divid{
	float: right;
}
ul.menu {
    position:relative;
    padding: 5px 5px 5px 5px;
    list-style: none;
    font-style: italic;
}
ul.menu a {
    text-decoration:none;
}
ul li {
	background-color: skyblue;
	
}
</style>