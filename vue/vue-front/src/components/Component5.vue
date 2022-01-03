<template>
    <div id="component5">
      <div id="wrapper">
        <div id="text-wrapper">
          <h1 id="text-title">The Fides Blog</h1>
          <p id="text-body">
          Learn more about Fides coummnity.
          This will help your  investing life for crypto asset
          </p>
        </div>
        <div id="image-wrapper">
          <div id="image-wrapper-blog1">
            <img id="fides-blog-1" src="../assets/fides-blog-1.png">
            <p>MakerDAO Intergrates Fides’s Staked ETF
               (wstETF)  as Collateral Asset</p>
            <p class="date">November 25</p>
          </div>
          <div id="image-wrapper-blog2">
            <img id="fides-blog-2" src="../assets/fides-blog-2.png">
            <p>MakerDAO Intergrates Fides’s Staked ETF
               (wstETF)  as Collateral Asset</p>
            <p class="date">November 25</p>
          </div>
          <div id="image-wrapper-blog3">
            <img id="fides-blog-3" src="../assets/fides-blog-3.png">
            <p>MakerDAO Intergrates Fides’s Staked ETF
               (wstETF)  as Collateral Asset</p>
            <p class="date">November 25</p>
          </div>
        </div>
      </div>
    </div>
</template>

<script>
export default {
  name: 'component5',
  components: {
  }
}
</script>

<style>
#component5{
  background:white;
  height: 572px;
}

#wrapper{
  top:2810px;
}

#text-wrapper{
  top: 2810px;
}

#image-wrapper{
  display: inline-block;
  width: 100%;
  height: 100%;
  background: #FFFFFF;
}

#image-wrapper-blog1, #image-wrapper-blog2, #image-wrapper-blog3{
  display:inline-block;
  background: #FFFFFF;
  box-shadow: 16px 16px 16px rgba(0, 0, 0, 0.2);
  border-radius: 20px 20px 20px 20px;
}

#fides-blog-1, #fides-blog-2, #fides-blog-3{
  height: 220px;
  width: 100%;
  left: 210px;
  background: #FFFFFF;
  display:inline-block;
}
.date{
  color: #8E8E8E;
}
</style>
