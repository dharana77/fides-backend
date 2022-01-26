<template>
    <div id="component4">
      <img id="component4-background" src="../assets/component4/background.png">
      <img id="component4-chess" src="../assets/component4/chess.png">
      <div id= "component4-wrapper">
        <div id="component4-textbox">
          <p class="component4-text-style"><span id="component4-text-title">피데스는..</span><br>
          피데스는 벤쳐 캐피탈의 탈중앙화를 통해 오픈된 커뮤니티를 지원하고, 수익을 커뮤니티에 환원할 것입니다.
          또한 길드, 게임파이 등 여러 기능을 런칭하는 것을 기대하고 있습니다.</p>
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
  width: 1600px;
  left: -800px;
  text-align: center;
}

#component4-background {
  position:absolute;
  width: 1600px;
  height: 458px;
  left: 0px;
  top: 2277px;
}
#component4-chess{
  position: absolute;
  height: 200px;
  width: 140px;
  left: 1360px;
  top: 2190px;
  border-radius: 0px;
}
#component4-wrapper{
  position: absolute;
  width: 900px;
  height: 200px;
  left: 350px;
  top: 2406px;
  background: rgba(255, 255, 255, 0.4);
  backdrop-filter: blur(20px);
  /* Note: backdrop-filter has minimal browser support */
  border-radius: 24px;
}
#component4-textbox{
  position: absolute;
  width: 780px;
  left: 60px;
  height: 142px;
  text-align:left;
}
.component4-text-style{
  position: absolute;
  font-family: Roboto;
  font-style: normal;
  font-size: 30px;
  line-height: 36px;
  font-weight: 500;
}
#component4-text-title{
  text-align: center;
  color: #E4297E;
  text-shadow: 0px 0px 30px rgba(0, 0, 0, 0.25);
  font-weight: 900;
}
#component4-text-content{

}
</style>
