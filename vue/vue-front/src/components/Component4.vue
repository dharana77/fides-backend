<template>
    <div id="component4">
      <div id="wrap-contents">
        <img id="why-fides" src="../assets/why-fides.png">
        <div id = "wrap-contents-box">
          <div id= "wrap-text">
            <h1 id="why-fides-text-title">Why Fides?</h1>
            <p id="why-fides-text-body">Fides is the new wave for Investing crypto asset, We can
            devide the right and the seed money.
            And then we share our profits with less capital</p>
          </div>
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
#wrap-contents{
  clear: both;
  position: relative;
}
#wrap-contents-box{
  position: absolute;
  top: 33%;
  left: 20%;
  width: 900px;
  height: 200px;

  background: rgba(255, 255, 255, 0.4);
  backdrop-filter: blur(20px);

  border-radius: 24px;
}
#why-fides {
  width: 100%;
  height: 595px;
  top: 42px;
}

#why-fides-text-title, #why-fides-text-body{
  text-align: center;
  top: 25%;
  left: 25%;
  padding: 5px 10px;
}
</style>
