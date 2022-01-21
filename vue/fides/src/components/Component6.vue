<template>
    <div id="component6">
      <img id="component6-chess1" class="chess" src="../assets/component6/chess1.png">
      <h1 id="component6-title">Join Our Community</h1>
      <p id="component6-text">Learn more about Fides system. chat with us and have your say in the future of the Fides ecosystem</p>

      <div id="component6-telegram-board"></div>
      <img id="component6-telegram-icon" src="../assets/component6/telegram.png" >
      <h3 id="component6-telegram-title">Telegram</h3>
      <p id="component6-telegram-content">Join our community</p>

      <div id="component6-twitter-board"></div>
      <img id="component6-twitter-icon" src="../assets/component6/twitter.png" >
      <h3 id="component6-twitter-title">Twitter</h3>
      <p id="component6-twitter-content">Follow @fidesFinance</p>

      <div id="component6-discord-board"></div>
      <img id="component6-discord-icon" src="../assets/component6/discord.png" >
      <h3 id="component6-discord-title">Discord</h3>
      <p id="component6-discord-content">Ask your question</p>

      <div id="component6-github-board"></div>
      <img id="component6-github-icon" src="../assets/component6/github.png" >
      <h3 id="component6-github-title">Github</h3>
      <p id="component6-github-content"> Github Contribute to the codebase.</p>

      <div id="component6-reddit-board"></div>
      <img id="component6-reddit-icon" src="../assets/component6/reddit.png" >
      <h3 id="component6-reddit-title">Reddit</h3>
      <p id="component6-reddit-content">Reddit Soon updated</p>

      <div id="component6-blog-board"></div>
      <img id="component6-blog-icon" src="../assets/component6/blog.png" >
      <h3 id="component6-blog-title">Blog</h3>
      <p id="component6-blog-content">Learn about Fides</p>

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
  height: 166px;
  width: 122px;
  left: 150px;
  top: -48px;
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
  top: 22px;
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
  width: 714px;
  height: 18px;
  left: 443px;
  top: 72px;
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
  top: 162px;
  border-radius: 0px;
}
#component6-telegram-title{
  position: absolute;
  width: 280px;
  height: 17px;
  left: 482px;
  top: 140px;
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
  top: 168px;
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
  top: 162px;
  border-radius: 0px;
}
#component6-twitter-title{
  position: absolute;
  width: 280px;
  height: 17px;
  left: 883px;
  top: 140px;
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
  top: 168px;
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
  top: 276px;
  border-radius: 0px;
}
#component6-github-icon{
  position: absolute;
  height: 36px;
  width: 36px;
  left: 831px;
  top: 276px;
  border-radius: 0px;
}
#component6-reddit-icon{
  position: absolute;
  height: 36px;
  width: 36px;
  left: 430px;
  top: 390px;
  border-radius: 0px;
}
#component6-blog-icon{
  position: absolute;
  height: 36px;
  width: 36px;
  left: 831px;
  top: 390px;
  border-radius: 0px;
}
#component6-discord-title{
  position: absolute;
  width: 280px;
  height: 17px;
  left: 482px;
  top: 254px;
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
  top: 254px;
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
  top: 368px;
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
  top: 368px;
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
  top: 282px;
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
  top: 282px;
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
  top: 396px;
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
   top: 396px;
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
