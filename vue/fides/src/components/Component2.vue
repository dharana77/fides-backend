<template>
    <div id="component2">
      <img id="component2-chess1" src="../assets/component2/chess1.png">
      <img id="component2-chess2" src="../assets/component2/chess2.png">

      <div id="component2-box1">
        <h1 id="component2-box1-title">What is Fides?</h1>
        <p id="component2-box1-text">Fides is innovative venture capital for the cryptocurrency managed by the investor community's collective intelligence which lowers the risk and maximizes the gain.</p>
        <img id = "component2-box1-icon" src="../assets/component2/box1-icon.png">
      </div>

      <div id="component2-box2">
        <h1 id="component2-box2-title">Be the community member</h1>
        <p id="component2-box2-text">You will have an opportunity to be a part of this capital as an investor, tester, and founding member.
You not only can do direct investment but also you can do indirect investment.</p>
        <img id = "component2-box2-icon" src="../assets/component2/box2-icon.png">
      </div>

      <div id="component2-box3">
        <h1 id="component2-box3-title">Shine your distinctive characters</h1>
        <p id="component2-box3-text">Fides assists you to maximize your investment capability through the "Tier" system. 
Also, this will allow us to do more effective communication in DAO.</p>
        <img id = "component2-box3-icon" src="../assets/component2/box3-icon.png">
      </div>

      <div id="component2-box4">
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
  width: 1600px;
  height: 1070px;
  left: -800px;
  top: 600px;
  background: #EDEDF2;
}
#component2-chess1 {
   position: absolute;
   height: 268px;
   width: 134px;
   left: 1300px;
   top: 105px;
   border-radius: 0px;
   background: rgba( 255, 255, 255, 0 );
}

#component2-chess2 {
  position: absolute;
  height: 248px;
  width: 144px;
  left: 150px;
  top: 848px;
  border-radius: 0px;
  background: rgba( 255, 255, 255, 0 );
}
#component2-box1{
  position: absolute;
  width: 390px;
  height: 510px;
  left: 400px;
  top: 70px;
  background: #F5F8FC;
  border-radius: 20px;
}
#component2-box1:hover{
 box-shadow: rgba(0, 0, 0, 0.12) 0px 0px 18px;
 }
#component2-box2{
  position: absolute;
  height: 390px;
  width: 390px;
  left: 810px;
  top: 70px;
  border-radius: 20px;
  background: #F5F8FC;
}
#component2-box2:hover{
 box-shadow: rgba(0, 0, 0, 0.12) 0px 0px 18px;
 }
#component2-box3{
  position: absolute;
  width: 390px;
  height: 390px;
  left: 400px;
  top: 610px;
  background: #F5F8FC;
  border-radius: 20px;
}
#component2-box3:hover{
 box-shadow: rgba(0, 0, 0, 0.12) 0px 0px 18px;
 }
#component2-box4{
  position: absolute;
  width: 390px;
  height: 510px;
  left: 810px;
  top: 490px;
  background: #F5F8FC;
  border-radius: 20px;
}
#component2-box4:hover{
 box-shadow: rgba(0, 0, 0, 0.12) 0px 0px 18px;
 }
#component2-box1-title{
  position: absolute;
  width: 280px;
  height: 16px;
  left: 50px;
  top: 44px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 900;
  font-size: 22px;
  line-height: 16px;
  /* identical to box height, or 73% */
  color: #0F8D7C;
  text-align: left;
}
#component2-box1-text{
  position: absolute;
  width: 280px;
  height: 60px;
  left: 50px;
  top: 80px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 16px;
  line-height: 20px;
  /* or 125% */
  color: #606060;
  text-align: left;
}
#component2-box1-button{
  position: absolute;
  width: 70px;
  height: 38px;
  left: 50px;
  top: 180px;
  box-sizing: border-box;
  border-radius: 20px;
  text-align: left;
}
#component2-box1-icon{
  position: absolute;
  width: 308.18px;
  height: 205.1px;
  left: 12px;
  top: 266px;
}
#component2-box2-title{
  position: absolute;
  width: 280px;
  height: 16px;
  left: 50px;
  top: 44px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 900;
  font-size: 22px;
  line-height: 16px;
  /* identical to box height, or 73% */
  color: #0F8D7C;
  text-align: left;
}
#component2-box2-text{
  position: absolute;
  width: 280px;
  height: 60px;
  left: 50px;
  top: 80px;
  font-family: Roboto;
  font-style: normal;
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
  width: 235.78px;
  height: 183.26px;
  left: 112px;
  top: 162.746px;
}

#component2-box3-title{
  position: absolute;
  width: 280px;
  height: 16px;
  left: 50px;
  top: 40px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 900;
  font-size: 22px;
  line-height: 16px;
  /* identical to box height, or 73% */
  color: #0F8D7C;
  text-align: left;
}
#component2-box3-text{
  position: absolute;
  width: 280px;
  height: 60px;
  left: 50px;
  top: 76px;
  font-family: Roboto;
  font-style: normal;
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
  left: 50px;
  top: 176px;
  box-sizing: border-box;
  border-radius: 20px;
}
#component2-box3-icon{
  position: absolute;
  height: 154.47857666015625px;
  width: 262.3983459472656px;
  left: 117.46px;
  top: 190px;
  border-radius: 0px;
}
#component2-box4-title{
  position: absolute;
  width: 280px;
  height: 16px;
  left: 50px;
  top: 44px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 900;
  font-size: 22px;
  color: #0F8D7C;
  line-height: 16px;
  text-align: left;
}
#component2-box4-text{
  position: absolute;
  width: 280px;
  height: 60px;
  left: 50px;
  top: 80px;
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
  width: 303.36px;
  height: 190.28px;
  left: 50px;
  top: 312px;
}
</style>
