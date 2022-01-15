<template>
    <nav id="navigation_bar">
        <img id="fides_icon" src="../assets/nav/fides_icon.png">
        <div class="nav" id="nav-home"><router-link to="/">Home</router-link></div>
        <div class="nav" id="nav-using"><router-link to="/using">Using fides</router-link></div>
        <div class="nav" id="nav-community"><router-link to="/community">Community</router-link></div>
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
#navigation_bar{
  position: absolute;
  width: 1600px;
  left: -800px;
}
#fides_icon{
  position: absolute;
  width: 40px;
  height: 40px;
  left: 410px;
  top: 37px;
  background: #4D6360;
}
#nav-home{
  position: absolute;
  width: 50px;
  height: 16px;
  left: 488px;
  top: 47px;

  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 18px;
  line-height: 18px;
  /* or 100% */
  color: #4D6360;
  background: rgba( 255, 255, 255, 0 );
}
#nav-using{
  position: absolute;
  width: 94px;
  height: 16px;
  left: 568px;
  top: 47px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 18px;
  line-height: 18px;
  /* or 100% */
  color: #4D6360;
  background: rgba( 255, 255, 255, 0 );
}
#nav-community{
  position: absolute;
  width: 94px;
  height: 16px;
  left: 692px;
  top: 47px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 18px;
  line-height: 18px;
  /* or 100% */
  color: #4D6360;
  background: rgba( 255, 255, 255, 0 );
}

nav .nav.active,
.nav a {
  color: inherit;
  text-decoration: none;
}
</style>
