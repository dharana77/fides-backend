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
  display:inline-block;
  width: 54px;
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
  text-transform:uppercase;
}
#nav-home:after{
  display:block;
  content: '';
  border-bottom: solid 2px #4D6360;  
  transform: scaleX(0);  
  transition: transform 250ms ease-in-out;
}
#nav-home:hover:after{
  transform: scaleX(1);
}
#nav-home:after{
  transform-origin:  0% 50%;
}
#nav-using{
  position: absolute;
  width: 92px;
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
#nav-using:after{
  display:block;
  content: '';
  border-bottom: solid 2px #4D6360;  
  transform: scaleX(0);  
  transition: transform 250ms ease-in-out;
}
#nav-using:hover:after{
  transform: scaleX(1);
}
#nav-using:after{
  transform-origin:  0% 50%;
}
#nav-community{
  position: absolute;
  width: 106px;
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
  text-transform:uppercase;
}
#nav-community:after{
  display:block;
  content: '';
  border-bottom: solid 2px #4D6360;  
  transform: scaleX(0);  
  transition: transform 250ms ease-in-out;
}
#nav-community:hover:after{
  transform: scaleX(1);
}
#nav-community:after{
  transform-origin:  0% 50%;
}
nav .nav.active,
.nav a {
  color: inherit;
  text-decoration: none;
}
</style>
