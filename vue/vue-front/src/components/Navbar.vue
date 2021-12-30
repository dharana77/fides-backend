<template>
    <nav id="vue">
        <img src="../assets/logo.png">
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
nav {
  width: 100vw;
  background-color: #FFFFFF;
  display: flex;
  align-items: center;
  justify-content: center;
}
nav .menu-item {
  color: #FFF;
  padding: 25px 40px;
  position: relative;
  text-align: center;
  border-bottom: 5px solid transparent;
  display: flex;
  transition: 0.4s;
}
nav .menu-item.active,
nav .menu-item:hover {
  background-color: #0d0d0e;
  border-bottom-color: #FFFFFF;
}
nav .menu-item a {
  color: inherit;
  text-decoration: none;
}
</style>
