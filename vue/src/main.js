import Vue from 'vue'
import App from './App.vue'
import router from './router'
import axios from 'axios'
import vuex from 'vuex'
import promise from 'es6-promise/auto'
import {store} from './store'

Vue.prototype.$http = axios
Vue.config.productionTip = false

new Vue({
  render: h => h(App),
  router,
  axios,
  vuex,
  promise,
  store
}).$mount('#app')
