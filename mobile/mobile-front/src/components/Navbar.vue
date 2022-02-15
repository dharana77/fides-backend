<template>
    <nav id="navigation_bar">
        <img id="nav-menu-bar" src="../assets/menu.png">
        <div id="nav-title">FIDES VENTURE</div>
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
  width: 375px;
  height: 62px;
  left: 0px;
  top: 0px;
  background: #4D6360;
  box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.1);
}

#nav-menu-bar{
  position: absolute;
  left: 4%;
  right: 89.07%;
  top: 0.25%;
  bottom: 99.38%;
}
#nav-title{
  position: absolute;
  width: 139px;
  height: 21px;
  left: 134px;
  top: 21px;
  font-family: Times New Roman;
  font-style: normal;
  font-weight: normal;
  font-size: 18px;
  line-height: 21px;
  color: #FFFFFF;
}
#component1-title{

}
</style>
