<template>
    <div id="component6">
      <img id="component6-chess1" class="chess" src="../assets/component6/chess1.png">
      <h1 id="component6-title">커뮤니티에 참여</h1>
      <p id="component6-text">피데스가 어떤 것인지 확인하고 커뮤니티에서 함께 프로젝트의 일원으로 투자 수익을 높이기 위한 더 높은 실력을 쌓아보세요!</p>

      <div id="component6-telegram-board"></div>
      <img id="component6-telegram-icon" src="../assets/component6/telegram.png" >
      <h3 id="component6-telegram-title">텔레그램</h3>
      <p id="component6-telegram-content">공지 및 정보 알림 획득</p>

      <div id="component6-twitter-board"></div>
      <img id="component6-twitter-icon" src="../assets/component6/twitter.png" >
      <h3 id="component6-twitter-title">트위터</h3>
      <p id="component6-twitter-content">@fidesFinance를 팔로우해보세요</p>

      <div id="component6-discord-board"></div>
      <img id="component6-discord-icon" src="../assets/component6/discord.png" >
      <h3 id="component6-discord-title">디스코드</h3>
      <p id="component6-discord-content">커뮤니티 논의, 토론 및 거버넌스를 통해<br> '투자' 생태계를 발전시켜보세요</p>

      <div id="component6-github-board"></div>
      <img id="component6-github-icon" src="../assets/component6/github.png" >
      <h3 id="component6-github-title">깃허브</h3>
      <p id="component6-github-content">개발에 참여하거나 ui, ux에 기여해보세요.</p>

      <div id="component6-reddit-board"></div>
      <img id="component6-reddit-icon" src="../assets/component6/reddit.png" >
      <h3 id="component6-reddit-title">레딧</h3>
      <p id="component6-reddit-content">더 넓은 커뮤니티 및 생태계를 위한 토론 및 정보 의견 획득</p>

      <div id="component6-blog-board"></div>
      <img id="component6-blog-icon" src="../assets/component6/blog.png" >
      <h3 id="component6-blog-title">미디엄</h3>
      <p id="component6-blog-content">핵심 정보, 소식들을 구체화하여 공유, 작성합니다</p>

      <img id="component6-chess2" class="chess" src="../assets/component6/chess2.png">
    </div>
</template>

<script>
export default {
  name: 'component6',
  components: {
  }
}
</script>

<style>
#component6{
  position: absolute;
  width: 1600px;
  height: 511px;
  left: -800px;
  top: 3356px;
  background: #EDEDF2;
}
#component6-chess1{
  position: absolute;
  height: 165.5461126167448px;
  width: 122.04705088612502px;
  left: 149px;
  top: -48.7153320313px;
  border-radius: 0px;
}
#component6-chess2{
  position:absolute;
  height: 216.23389008128223px;
  width: 126.44475752047089px;
  left: 1424.5087890625px;
  top: 427.291992188px;
  border-radius: 0px;
}
.chess{
  background: rgba( 255, 255, 255, 0 );
}
#component6-title{
  position: absolute;
  width: 278px;
  height: 30px;
  left: 661px;
  top: 44px;
  font-family: Roboto;
  font-style: normal;
  font-weight: bold;
  font-size: 30px;
  line-height: 30px;
  /* identical to box height, or 100% */
  text-align: center;
  color: #000000;
}
#component6-text{
  position: absolute;
  width: 800px;
  height: 18px;
  left: 418px;
  top: 90px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 16px;
  line-height: 20px;
  /* or 125% */
  color: #606060;
}
#component6-telegram-board{
  position: absolute;
  width: 380px;
  height: 95px;
  left: 410px;
  top: 132px;
  background: #FFFFFF;
  box-shadow: 0px 0px 12px rgba(0, 0, 0, 0.1);
  border-radius: 20px;
}
#component6-telegram-icon{
  position: absolute;
  height: 36px;
  width: 36px;
  left: 430px;
  top: 154px;
  border-radius: 0px;
}
#component6-telegram-title{
  position: absolute;
  width: 280px;
  height: 17px;
  left: 482px;
  top: 138px;
  font-family: Roboto;
  font-style: normal;
  font-weight: bold;
  font-size: 20px;
  line-height: 20px;
  /* or 100% */
  color: #000000;
  text-align:left;
}
#component6-telegram-content{
  position: absolute;
  width: 280px;
  height: 17px;
  left: 482px;
  top: 162px;
  font-family: Roboto;
  font-style: normal;
  font-weight: normal;
  font-size: 16px;
  line-height: 18px;
  /* or 112% */
  color: #606060;
  background: rgba( 255, 255, 255, 0 );
  text-align:left;
}
#component6-twitter-board{
  position: absolute;
  width: 380px;
  height: 95px;
  left: 810px;
  top: 132px;
  background: #FFFFFF;
  box-shadow: 0px 0px 12px rgba(0, 0, 0, 0.1);
  border-radius: 20px;
}
#component6-twitter-icon{
  position: absolute;
  height: 36px;
  width: 36px;
  left: 831px;
  top: 154px;
  border-radius: 0px;
}
#component6-twitter-title{
  position: absolute;
  width: 280px;
  height: 17px;
  left: 883px;
  top: 138px;
  font-family: Roboto;
  font-style: normal;
  font-weight: bold;
  font-size: 20px;
  line-height: 20px;
  /* or 100% */
  color: #000000;
  text-align:left;
}
#component6-twitter-content{
  position: absolute;
  width: 280px;
  height: 17px;
  left: 883px;
  top: 162px;
  font-family: Roboto;
  font-style: normal;
  font-weight: normal;
  font-size: 16px;
  line-height: 18px;
  /* or 112% */
  color: #606060;
  text-align:left;
}
#component6-discord-board{
  position: absolute;
  width: 380px;
  height: 95px;
  left: 410px;
  top: 247px;
  background: #FFFFFF;
  box-shadow: 0px 0px 12px rgba(0, 0, 0, 0.1);
  border-radius: 20px;
}
#component6-github-board{
  position: absolute;
  width: 380px;
  height: 95px;
  left: 810px;
  top: 247px;
  background: #FFFFFF;
  box-shadow: 0px 0px 12px rgba(0, 0, 0, 0.1);
  border-radius: 20px;
}
#component6-reddit-board{
  position: absolute;
  width: 380px;
  height: 95px;
  left: 410px;
  top: 362px;
  background: #FFFFFF;
  box-shadow: 0px 0px 12px rgba(0, 0, 0, 0.1);
  border-radius: 20px;
}
#component6-blog-board{
  position: absolute;
  width: 380px;
  height: 95px;
  left: 810px;
  top: 362px;
  background: #FFFFFF;
  box-shadow: 0px 0px 12px rgba(0, 0, 0, 0.1);
  border-radius: 20px;
}
#component6-discord-icon{
  position: absolute;
  height: 36px;
  width: 36px;
  left: 430px;
  top: 272px;
  border-radius: 0px;
}
#component6-github-icon{
  position: absolute;
  height: 36px;
  width: 36px;
  left: 831px;
  top: 272px;
  border-radius: 0px;
}
#component6-reddit-icon{
  position: absolute;
  height: 36px;
  width: 36px;
  left: 430px;
  top: 391px;
  border-radius: 0px;
}
#component6-blog-icon{
  position: absolute;
  height: 36px;
  width: 36px;
  left: 831px;
  top: 391px;
  border-radius: 0px;
}
#component6-discord-title{
  position: absolute;
  width: 280px;
  height: 17px;
  left: 482px;
  top: 256px;
  font-family: Roboto;
  font-style: normal;
  font-weight: bold;
  font-size: 20px;
  line-height: 20px;
  color: #000000;
  text-align:left;
}
#component6-github-title{
  position: absolute;
  width: 280px;
  height: 17px;
  left: 883px;
  top: 255px;
  font-family: Roboto;
  font-style: normal;
  font-weight: bold;
  font-size: 20px;
  line-height: 20px;
  /* or 100% */
  color: #000000;
  text-align:left;
}
#component6-reddit-title{
  position: absolute;
  width: 280px;
  height: 17px;
  left: 482px;
  top: 375px;
  font-family: Roboto;
  font-style: normal;
  font-weight: bold;
  font-size: 20px;
  line-height: 20px;
  /* or 100% */
  color: #000000;
  text-align:left;
}
#component6-blog-title{
  position: absolute;
  width: 280px;
  height: 17px;
  left: 883px;
  top: 375px;
  font-family: Roboto;
  font-style: normal;
  font-weight: bold;
  font-size: 20px;
  line-height: 20px;
  /* or 100% */
  color: #000000;
  text-align:left;
}
#component6-discord-content{
  position: absolute;
  width: 280px;
  height: 17px;
  left: 482px;
  top: 280px;
  font-family: Roboto;
  font-style: normal;
  font-weight: normal;
  font-size: 16px;
  line-height: 18px;
  /* or 112% */
  color: #606060;
  text-align: left;
}
#component6-github-content{
  position: absolute;
  width: 280px;
  height: 17px;
  left: 883px;
  top: 280px;
  font-family: Roboto;
  font-style: normal;
  font-weight: normal;
  font-size: 16px;
  line-height: 18px;
  /* or 112% */
  color: #606060;
  text-align: left;
}
#component6-reddit-content{
  position: absolute;
  width: 280px;
  height: 17px;
  left: 482px;
  top: 399px;
  font-family: Roboto;
  font-style: normal;
  font-weight: normal;
  font-size: 16px;
  line-height: 18px;
  /* or 112% */
  color: #606060;
  text-align:left;
}
#component6-blog-content{
   position: absolute;
   width: 280px;
   height: 17px;
   left: 882px;
   top: 399px;
   font-family: Roboto;
   font-style: normal;
   font-weight: normal;
   font-size: 16px;
   line-height: 18px;
   /* or 112% */
   color: #606060;
   text-align:left;
 }
</style>
