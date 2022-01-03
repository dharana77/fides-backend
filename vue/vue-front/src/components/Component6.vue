<template>
    <div id="component6">
      <div id="Chess3">
        <img id="chess3" class="chess" src="../assets/Chess3.png">
      </div>
      <div id="text-wrapper">
        <h1>Join Our Community</h1>
        <p>Learn more about Fides system. chat with us and have your say in the future of the Fides ecosystem</p>
      </div>
      <div id="contents-wrapper">
        <div id="telegram-board">
          <img id="white-board" class="board" src="../assets/white_rectangle.png">
          <img id="telegram-image" src="../assets/telegram.png" >
          <div id="telegram-text-board-wrapper">
            <h3>Telegram</h3>
            <p>Join our community</p>
          </div>
        </div>
        <div id="twitter-board">
          <img id="white-board" class="board" src="../assets/white_rectangle.png">
          <img id="twitter-image" src="../assets/twitter.png" >
          <div id="twitter-text-board-wrapper">
            <h3>Twitter</h3>
            <p>Follow @fidemeta</p>
          </div>
        </div>
        <div id="discord-board">
          <img id="white-board" class="board" src="../assets/white_rectangle.png">
          <img id="discord-image" src="../assets/discord.png" >
          <div id="discord-text-board-wrapper">
            <h3>Discord</h3>
            <p>Join our communityy</p>
          </div>
        </div>
        <div id="github-board">
          <img id="white-board" class="board" src="../assets/white_rectangle.png">
          <img id="github-image" src="../assets/github.png" >
          <div id="github-text-board-wrapper">
            <h3>Github</h3>
            <p> Github Contribute to the codebase.</p>
          </div>
        </div>
        <div id="reddit-board">
          <img id="white-board" class="board" src="../assets/white_rectangle.png">
          <img id="reddit-image" src="../assets/reddit.png" >
          <div id="reddit-text-board-wrapper">
            <h3>Reddit</h3>
            <p>Reddit Soon updated</p>
          </div>
        </div>
        <div id="blog-board">
          <img id="white-board" class="board" src="../assets/white_rectangle.png">
          <img id="blog-image" src="../assets/blog.png" >
          <div id="blog-text-board-wrapper">
            <h3>Blog</h3>
            <p>Blog Learn about Fides</p>
          </div>
        </div>
      </div>
      <div id="Chess4">
        <img id="chess4" class="chess" src="../assets/Chess4.png">
      </div>
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
  background: #EDEDF2;
}
#Chess3{
  text-align: left;
}
#Chess4{
  text-align: right;
  left: 89.03%;
  top: 80.34%;
  bottom: 15.07%;
}
#chess3{
  height: 165.5461126167448px;
  width: 122.04705088612502px;
  border-radius: 0px;
}

#chess4{
  right: 3.07%;
  height: 216.23389008128223px;
  width: 126.44475752047089px;
  border-radius: 0px;
}

.chess{
  background: rgba( 255, 255, 255, 0 );
}

.board{
  height: 95px;
  width: 380px;
  border-radius: 20px;
}
</style>
