<template>
  <div id="app">
    <Navbar/>
    <router-view/>
    <Component1/>
  </div>
</template>

<script>
import Navbar from '@/components/Navbar'
import Component1 from '@/components/Component1'
export default {
  name: 'App',
  components: {
    Navbar,
    Component1
  }
}
</script>

<style>
#app {
  text-align: center;
}
</style>
