<template>
    <nav id="navigation_bar">
        <img id="nav-menu-bar" src="../assets/menu.png">
        <img id="nav-icon" src="../assets/nav-icon.png">
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
  width: 26px;
  height: 26px;
  top: 18px;
  left : 15px;
  bottom: 18px;
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
  line-height: 20.7px;
  color: #FFFFFF;
}
#nav-icon{
  position: absolute;
  left: 102px;
  top: 19px;
  height: 24px;
  bottom: 19px;
  width:20px;
}
</style>
