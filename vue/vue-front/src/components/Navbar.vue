<template>
    <nav id="vue">
        <div class="menu-item"><router-link to="/">Home</router-link></div>
        <div class="menu-item"><router-link to="/using">Using fides</router-link></div>
        <div class="menu-item"><router-link to="/community">Community</router-link></div>
        <Services title="Services"/>
    </nav>
</template>

<script>
import Services from '../components/Services'
export default {
  name: 'navbar',
  components: {
    Services
  }
}
</script>

<style>
</style>
