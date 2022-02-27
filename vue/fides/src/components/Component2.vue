<template>
    <div id="component2">

      <div id="component2-box1" class="animate__animated animate__rotateIn">
        <h1 id="component2-box1-title">What is Fides?</h1>
        <p id="component2-box1-text">Fides is innovative venture capital for the cryptocurrency managed by the investor community's collective intelligence which lowers the risk and maximizes the gain.</p>
        <img id = "component2-box1-icon" src="../assets/component2/box1-icon.png">
      </div>

      <div id="component2-box2" class="animate__animated animate__rotateInDownRight">
        <h1 id="component2-box2-title">Be the community member</h1>
        <p id="component2-box2-text">You will have an opportunity to be a part of this capital as an investor, tester, and founding member.
You not only can do direct investment but also you can do indirect investment.</p>
        <img id = "component2-box2-icon" src="../assets/component2/box2-icon.png">
      </div>

      <div id="component2-box3" class="animate__animated animate__rotateIn">
        <h1 id="component2-box3-title">Shine your distinctive characters</h1>
        <p id="component2-box3-text">Fides assists you to maximize your investment capability through the "Tier" system.
Also, this will allow us to do more effective communication in DAO.</p>
        <img id = "component2-box3-icon" src="../assets/component2/box3-icon.png">
      </div>

      <div id="component2-box4" class="animate__animated animate__zoomIn">
        <h1 id="component2-box4-title">Research and Discussion about the investment.</h1>
        <p id="component2-box4-text">Vitalization of DAO is possible through active discussion, not just for the voting.
This allows the guilds to be more productive with assurance, and stimulate the faster growth.</p>
        <img id="component2-box4-icon" src="../assets/component2/box4-icon.png">
      </div>
    </div>
</template>

<script>
export default {
  name: 'component2',
  components: {
  }
}
</script>

<style>
#component2{
  position: absolute;
  width: 2560px;
  height: 1070px;
  left: -1280px;
  top: 600px;
  background: #EDEDF2;
}
#component2-chess1 {
   position: absolute;
   height: 268px;
   width: 134px;
   left: 1780px;
   top: 105px;
   border-radius: 0px;
   background: rgba( 255, 255, 255, 0 );
}

#component2-chess2 {
  position: absolute;
  height: 248px;
  width: 144px;
  left: 630px;
  top: 848px;
  border-radius: 0px;
  background: rgba( 255, 255, 255, 0 );
}
#component2-box1{
  position: absolute;
  width: 390px;
  height: 510px;
  left: 880px;
  top: 70px;
  background: #F5F8FC;
  border-radius: 20px;
  animation-duration:3.5s;
}
#component2-box1:hover{
 box-shadow: rgba(0, 0, 0, 0.12) 0px 0px 18px;
 }
#component2-box2{
  position: absolute;
  height: 390px;
  width: 390px;
  left: 1290px;
  top: 70px;
  border-radius: 20px;
  background: #F5F8FC;
  animation-duration:3.8s;
}
#component2-box2:hover{
 box-shadow: rgba(0, 0, 0, 0.12) 0px 0px 18px;
 }
#component2-box3{
  position: absolute;
  width: 390px;
  height: 390px;
  left: 880px;
  top: 610px;
  background: #F5F8FC;
  border-radius: 20px;
  animation-duration:3.5s;
}
#component2-box3:hover{
 box-shadow: rgba(0, 0, 0, 0.12) 0px 0px 18px;
 }
#component2-box4{
  position: absolute;
  width: 390px;
  height: 510px;
  left: 1290px;
  top: 490px;
  background: #F5F8FC;
  border-radius: 20px;
  animation-duration:3.5s;
}
#component2-box4:hover{
 box-shadow: rgba(0, 0, 0, 0.12) 0px 0px 18px;
 }
#component2-box1-title{
  position: absolute;
  width: 300px;
  height: 16px;
  left: 45px;
  top: 40px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 1000;
  font-size: 22px;
  line-height: 16px;
  /* identical to box height, or 73% */
  color: #0F8D7C;
  text-align: left;
}
#component2-box1-text{
  position: absolute;
  width: 300px;
  height: 60px;
  left: 45px;
  top: 74px;
  font-family: Roboto;
  font-weight: 500;
  font-size: 16px;
  line-height: 20px;
  /* or 125% */
  color: #606060;
  text-align: left;
}
#component2-box1-icon{
  position: absolute;
  width: 366px;
  height: 490px;
  left: 10px;
  top: 20px;
}
#component2-box2-title{
  position: absolute;
  width: 300px;
  height: 16px;
  left: 45px;
  top: 40px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 1000;
  font-size: 22px;
  line-height: 16px;
  /* identical to box height, or 73% */
  color: #0F8D7C;
  text-align: left;
}
#component2-box2-text{
  position: absolute;
  width: 300px;
  height: 60px;
  left: 45px;
  top: 74px;
  font-family: Roboto;
  font-weight: 500;
  font-size: 16px;
  line-height: 20px;
  /* or 125% */
  color: #606060;
  text-align: left;
}
#component2-box2-button{
  position: absolute;
  width: 70px;
  height: 38px;
  left: 50px;
  top: 180px;
  box-sizing: border-box;
  border-radius: 20px;
}
#component2-box2-icon{
  position: absolute;
  width: 390px;
  height: 390px;
  left: 0px;
  top: 0px;
}

#component2-box3-title{
  position: absolute;
  width: 300px;
  height: 16px;
  left: 45px;
  top: 40px;
  font-family: Roboto;
  font-weight: 1000;
  font-size: 22px;
  line-height: 26px;
  /* identical to box height, or 73% */
  color: #0F8D7C;
  text-align: left;
}
#component2-box3-text{
  position: absolute;
  width: 300px;
  height: 60px;
  left: 45px;
  top: 104px;
  font-family: Roboto;
  font-weight: 500;
  font-size: 16px;
  line-height: 20px;
  /* or 125% */
  color: #606060;
  text-align: left;
}
#component2-box3-button{
  position: absolute;
  width: 70px;
  height: 38px;
  left: 45px;
  top: 176px;
  box-sizing: border-box;
  border-radius: 20px;
}
#component2-box3-icon{
  position: absolute;
  height: 370px;
  width: 370px;
  left: 10px;
  top: 20px;
  border-radius: 0px;
}
#component2-box4-title{
  position: absolute;
  width: 280px;
  height: 16px;
  left: 45px;
  top: 40px;
  font-family: Roboto;
  font-weight: 1000;
  font-size: 22px;
  color: #0F8D7C;
  line-height: 26px;
  text-align: left;
}
#component2-box4-text{
  position: absolute;
  width: 300px;
  height: 60px;
  left: 45px;
  top: 104px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 16px;
  line-height: 20px;
  /* or 125% */
  color: #606060;
  text-align: left;
}
#component2-box4-button{
  position: absolute;
  width: 70px;
  height: 38px;
  left: 50px;
  top: 180px;
  box-sizing: border-box;
  border-radius: 20px;
}
#component2-box4-icon{
  position: absolute;
  width: 304px;
  height: 190px;
  left: 42px;
  top: 290px;
}
</style>
