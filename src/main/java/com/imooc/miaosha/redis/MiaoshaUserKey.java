package com.imooc.miaosha.redis;

public class MiaoshaUserKey extends BasePrefix{

	//用户登陆的cookie过期时间设置为2天
	public static final int TOKEN_EXPIRE = 3600*24 * 2;
	public static MiaoshaUserKey token = new MiaoshaUserKey(TOKEN_EXPIRE, "tk");

	private MiaoshaUserKey(int expireSeconds, String prefix) {
		super(expireSeconds, prefix);
	}

}
