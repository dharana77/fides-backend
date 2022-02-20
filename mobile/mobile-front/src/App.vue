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
import Component4 from '@/components/Component4'
import Component5 from '@/components/Component5'
import Component6 from '@/components/Component6'
import Component7 from '@/components/Component7'
import Component8 from '@/components/Component8'
export default {
  name: 'App',
  components: {
      Navbar,
      Component1,
      Component2,
      Component3,
      Component4,
      Component5,
      Component6,
      Component7,
      Component8,
    }
}
</script>

<style>
#app {
  position:absolute;
  left:50%;
}
body {
  overflow-x: hidden;
}
</style>
