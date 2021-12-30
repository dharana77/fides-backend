<template>
    <nav id="vue">
        <img src="../assets/logo3.png">
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
img{
  width: 40px;
  height: 40px;
  left: 410px;
  top: 37px;

  background: #4D6360;
}
nav {
  width: 100vw;
  background-color: #FFFFFF;
  display: flex;
  align-items: center;
  justify-content: center;
}

nav .menu-item {
  color: #4D6360;;
  width: 93px;
  height: 16px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 18px;
  line-height: 18px;
  /* or 100% */
  padding: 25px 40px;
  position: relative;
  text-align: center;
  border-bottom: 5px solid transparent;
  display: flex;
  transition: 0.4s;
}
nav .menu-item.active,
nav .menu-item:hover {
  background-color: #FFFFFF;
  border-bottom-color: #FFFFFF;
}
nav .menu-item a {
  color: inherit;
  text-decoration: none;
}
</style>
