<template>
    <div id="component8">
      <img id="component8-background" src="../assets/component8/background1.png">
      <h3 id="component8-title">더 많은 정보를 얻으려면</h3>
      <p id="component8-explain">우리가 하려고 하는 프로젝트와 시작, 프로젝트 내용들을 백서에 기술해두었습니다. 많은 것들이 있지만 프로젝트 성공을
      통해 윈윈을 달성하고 성공적인 web3의 상징 중 하나가 되길 희망합니다.</p>
      <img id="component8-connect-img" src="../assets/component8/connect.png">
      <h4 id="component8-connect-text">백서 및 로드맵</h4>
    </div>
</template>

<script>
export default {
  name: 'component8',
  components: {
  }
}
</script>

<style>
#component8{
  position: absolute;
  width: 1600px;
  height: 300px;
  left: -800px;
  top: 4397px;
  background-color: #FFFFFF;
  text-align: center;
}
#component8-background{
  position: absolute;
  width: 1600px;
  height: 300px;
  left: 0px;
}
#component8-title{
  position: absolute;
  width: 326px;
  height: 30px;
  left: 639px;
  top: 50px;

  font-family: Roboto;
  font-style: normal;
  font-weight: bold;
  font-size: 30px;
  line-height: 30px;
  /* identical to box height, or 100% */

  text-align: center;

  color: #FFFFFF;
}
#component8-explain{
  position: absolute;
  width: 450px;
  height: 34px;
  left: 575px;
  top: 127px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 16px;
  line-height: 20px;
  /* or 125% */

  text-align: center;
  color: #FFFFFF;
}
#component8-connect-img{
  position: absolute;
  width: 210px;
  height: 48px;
  left: 695px;
  top: 198px;
  background: #E9863B;
  border-radius: 30px;
}
#component8-connect-text{
  position: absolute;
  width: 168px;
  height: 18px;
  left: 716px;
  top: 180px;

  font-family: Roboto;
  font-style: normal;
  font-weight: 1500;
  font-size: 24px;
  line-height: 20px;
  /* or 83% */
  text-align: center;
  color: #FFFFFF;
}
</style>
