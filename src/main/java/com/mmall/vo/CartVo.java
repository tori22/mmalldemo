package com.mmall.vo;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by DWT on 2018/3/28.
 */
public class CartVo {
    List<CartProductVo> cartProductVoList;
    private BigDecimal cartTotalPrice;
    private Boolean allchecked;
    private String imageHost;

    public List<CartProductVo> getCartProductVoList() {
        return cartProductVoList;
    }

    public void setCartProductVoList(List<CartProductVo> cartProductVoList) {
        this.cartProductVoList = cartProductVoList;
    }

    public BigDecimal getCartTotalPrice() {
        return cartTotalPrice;
    }

    public void setCartTotalPrice(BigDecimal cartTotalPrice) {
        this.cartTotalPrice = cartTotalPrice;
    }

    public String getImageHost() {
        return imageHost;
    }

    public void setImageHost(String imageHost) {
        this.imageHost = imageHost;
    }

    public Boolean getAllchecked() {
        return allchecked;
    }

    public void setAllchecked(Boolean allchecked) {
        this.allchecked = allchecked;
    }
}
