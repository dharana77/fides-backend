<template>
    <div id="component4">
       <img id="component4-background" src="../assets/component4-background.png"></img>
       <div id="component4-box1">
          <div id="component4-box1-content">
            <span class="green"> Why Fides?</span><br>
            Fides support the open community through decentralization of venture capital, and we will distribute the gain back to the community.
          </div>
       </div>
    </div>
</template>

<script>
export default {
  name: 'component4',
  components: {
  }
}
</script>

<style>

#component4{
  position: absolute;
  width: 375px;
}
#component4-background{
  position: absolute;
  width: 375px;
  height: 402px;
  left: 0.5px;
  top: 3893px;
}
#component4-box1{
  position: absolute;
  width: 335px;
  height: 258px;
  left: 20px;
  top: 3964px;
  background: rgba(255, 255, 255, 0.4);
  backdrop-filter: blur(20px);
  /* Note: backdrop-filter has minimal browser support */

  border-radius: 24px;
}
#component4-box1-content{
  position: absolute;
  width: 295px;
  height: 203px;
  left: 20px;
  top: 28px;
  font-weight: bold;
  font-family: Roboto;
  font-style: normal;
  font-size: 22px;
  line-height: 30px;
  /* or 136% */
  text-shadow: 0px 0px 12px rgba(0, 0, 0, 0.4);
}
.green{
  color: #0F8D7C;
}
</style>
