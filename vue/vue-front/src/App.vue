<template>
  <div id="app">
    <Navbar/>
    <Component1/>
    <Component2/>
    <Component3/>
    <Component4/>
    <Component5/>
    <Component6/>
    <Component7/>
    <Component8/>
  </div>
</template>

<script>
import Navbar from '@/components/Navbar'
import Component1 from '@/components/Component1'
import Component2 from '@/components/Component2'
import Component3 from '@/components/Component3'
export default {
  name: 'App',
  components: {
    Navbar,
    Component1,
    Component2,
    Component3
  }
}
</script>

<style>
#app {
  width: 100%;
  text-align: center;
  overflow-x: hidden;

}
</style>
