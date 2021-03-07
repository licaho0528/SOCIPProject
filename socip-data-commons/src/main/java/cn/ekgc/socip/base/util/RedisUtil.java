package cn.ekgc.socip.base.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName <b>Redis 操作工具类</b>
 * @Description
 * @Author Admin
 * @Date 2021-03-02 22:40
 * @Version 1.0
 */
@Component
public class RedisUtil {
	@Autowired
	private StringRedisTemplate redisTemplate;

	/**
	 * <b>根据 Key 将对应的 value 存入 Redis 中</b>
	 * @param [key, value]
	 * @return boolean
	 * @author admin
	 * @date 2021-03-02 22:48
	 */
	public boolean saveToRedis(String key, Object value) {

		if (value != null) {

			//将 Object 类型 value 转换为 Json 并存入 Redis
			String valueJson = JsonUtil.parseToJson(value);
			redisTemplate.opsForValue().set(key, valueJson);

			//为存入的信息设定过期时间
			redisTemplate.expire(key, BaseConstantUtil.EXPIRE_MINUTE, TimeUnit.MINUTES);

			return true;
		}

		return false;
	}

	/**
	 * <b>根据 Key 从 Redis 中获取 value </b>
	 *
	 * @param [key, value]
	 * @return boolean
	 * @author admin
	 * @date 2021-03-02 22:48
	 */
	public Object getToRedis(String key, Class argClass) {

		//根据 key 获取存贮在 Redis 中的 value
		String valueJson = redisTemplate.opsForValue().get(key);

		if (valueJson != null) {
			//将 Json 转换为 Object
			return JsonUtil.parseToObject(valueJson, argClass);
		}

		return null;
	}
}
