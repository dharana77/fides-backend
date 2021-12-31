<template>
  <div id="app">
    <Navbar/>
    <router-view/>
    <Component1/>
    <Component2/>
    <Component3/>
    <Component4/>
  </div>
</template>

<script>
import Navbar from '@/components/Navbar'
import Component1 from '@/components/Component1'
import Component2 from '@/components/Component2'
import Component3 from '@/components/Component3'
import Component4 from '@/components/Component4'
export default {
  name: 'App',
  components: {
    Navbar,
    Component1,
    Component2,
    Component3,
    Component4
  }
}
</script>

<style>
#app {
  text-align: center;
}
</style>
