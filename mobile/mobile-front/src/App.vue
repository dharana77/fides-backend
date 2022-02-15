<template>
  <div id="app">
    <Navbar/>
    <Components/>
  </div>
</template>

<script>
import Navbar from '@/components/Navbar'
import Components from '@/components/Components'
export default {
  name: 'App',
  components: {
      Navbar,
      Components
    }
}
</script>

<style>
#app {
  background: black;
}
</style>
