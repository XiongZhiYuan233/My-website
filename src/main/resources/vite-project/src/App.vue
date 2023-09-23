<template>
  <div>
    <div>
      <Log_Index @login="loginUser" />
      <kuai id="test" style="display: none;" />
    </div>
    <!-- <kuai/> -->
    <!-- <component :is="currentComponent" @login="loginUser"></component> -->
  </div>
</template>

<script>

import Kuai from './components/kuai.vue'
import Log_Index from './Log_Index.vue'


export default {
  data(){
    return{
      currentComponent:'Log_Index'
    }
  },
  components: { Log_Index, Kuai },
  methods:{
    loginUser(token){
      if(token != 0){
        document.getElementById('test').style.display = 'block';
      }
    }
    // loginUser(){
    //   // this.currentComponent = 'Kuai'
    //   document.getElementById('test').innerHTML = 'aaa';
    //   return 0;
    // }
  }
}
</script>

<style>

</style>