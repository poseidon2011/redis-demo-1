package com.redis.castdb.demo.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.redis.castdb.demo.RedisJedisClient;
import com.redis.castdb.demo.entity.FootballTeam;
import com.redis.castdb.demo.entity.TeamMember;

public class RedisJedisClientTest {

	private final static Logger logger = LogManager.getLogger();
	private RedisJedisClient redisClient;

	@Before
	public void setUp() throws Exception {
		logger.debug("单元测试--->>开始");
		redisClient = new RedisJedisClient.Builder("192.168.1.108", 6379)
				.selectDataBase(10)
				.setMaxIdle(30)
				.setMinIdle(10)
				.setMaxTotal(50)
				.build();
	}

	@After
	public void tearDown() throws Exception {
		logger.debug("单元测试--->>结束");
	}

	/**
	 * 球队列表
	 */
	public List<FootballTeam> getFootballTeam() {
		FootballTeam team1 = new FootballTeam();
		team1.setTeamId(1);
		team1.setTeamName("公牛");
		team1.setTeamAddress("芝加哥");

		FootballTeam team2 = new FootballTeam();
		team2.setTeamId(2);
		team2.setTeamName("龙之魂");
		team2.setTeamAddress("中国");

		FootballTeam team3 = new FootballTeam();
		team3.setTeamId(3);
		team3.setTeamName("足球梦");
		team3.setTeamAddress("巴西");

		List<FootballTeam> teamList = new ArrayList<FootballTeam>();
		teamList.add(team1);
		teamList.add(team2);
		teamList.add(team3);
		return teamList;
	}

	/**
	 * 球员列表
	 */
	public List<TeamMember> getTeamMember() throws Exception {
		TeamMember member1 = new TeamMember();
		member1.setUserId(1);
		member1.setTeamId(1);
		member1.setUserName("Davolio");
		member1.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1989-01-01"));
		member1.setGender(1);
		member1.setUserAddress("芝加哥");

		TeamMember member2 = new TeamMember();
		member2.setUserId(2);
		member2.setTeamId(1);
		member2.setUserName("Fuller");
		member2.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1986-02-11"));
		member2.setGender(1);
		member2.setUserAddress("芝加哥");

		TeamMember member3 = new TeamMember();
		member3.setUserId(3);
		member3.setTeamId(1);
		member3.setUserName("Leverling");
		member3.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1986-03-21"));
		member3.setGender(1);
		member3.setUserAddress("芝加哥");

		TeamMember member4 = new TeamMember();
		member4.setUserId(4);
		member4.setTeamId(1);
		member4.setUserName("Peacock");
		member4.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1986-04-05"));
		member4.setGender(1);
		member4.setUserAddress("芝加哥");

		TeamMember member5 = new TeamMember();
		member5.setUserId(5);
		member5.setTeamId(1);
		member5.setUserName("Buchanan");
		member5.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1986-05-15"));
		member5.setGender(1);
		member5.setUserAddress("芝加哥");

		TeamMember member6 = new TeamMember();
		member6.setUserId(6);
		member6.setTeamId(1);
		member6.setUserName("Suyama");
		member6.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1986-06-25"));
		member6.setGender(1);
		member6.setUserAddress("芝加哥");

		TeamMember member7 = new TeamMember();
		member7.setUserId(7);
		member7.setTeamId(1);
		member7.setUserName("King");
		member7.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1986-07-07"));
		member7.setGender(1);
		member7.setUserAddress("芝加哥");

		TeamMember member8 = new TeamMember();
		member8.setUserId(8);
		member8.setTeamId(1);
		member8.setUserName("Callahan");
		member8.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1986-08-17"));
		member8.setGender(1);
		member8.setUserAddress("芝加哥");

		TeamMember member9 = new TeamMember();
		member9.setUserId(9);
		member9.setTeamId(1);
		member9.setUserName("Dodsworth");
		member9.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1986-09-27"));
		member9.setGender(1);
		member9.setUserAddress("芝加哥");

		TeamMember member10 = new TeamMember();
		member10.setUserId(10);
		member10.setTeamId(1);
		member10.setUserName("Green");
		member10.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1986-10-19"));
		member10.setGender(1);
		member10.setUserAddress("芝加哥");

		TeamMember member11 = new TeamMember();
		member11.setUserId(11);
		member11.setTeamId(1);
		member11.setUserName("Jaina");
		member11.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1986-11-29"));
		member11.setGender(1);
		member11.setUserAddress("芝加哥");

		TeamMember member12 = new TeamMember();
		member12.setUserId(12);
		member12.setTeamId(3);
		member12.setUserName("Maria Anders");
		member12.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1989-01-01"));
		member12.setGender(1);
		member12.setUserAddress("巴西");

		TeamMember member13 = new TeamMember();
		member13.setUserId(13);
		member13.setTeamId(3);
		member13.setUserName("Ana Trujillo");
		member13.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1986-02-11"));
		member13.setGender(1);
		member13.setUserAddress("巴西");

		TeamMember member14 = new TeamMember();
		member14.setUserId(14);
		member14.setTeamId(3);
		member14.setUserName("Antonio Moreno");
		member14.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1986-03-21"));
		member14.setGender(1);
		member14.setUserAddress("巴西");

		TeamMember member15 = new TeamMember();
		member15.setUserId(15);
		member15.setTeamId(3);
		member15.setUserName("Thomas Hardy");
		member15.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1986-04-05"));
		member15.setGender(1);
		member15.setUserAddress("巴西");

		TeamMember member16 = new TeamMember();
		member16.setUserId(16);
		member16.setTeamId(3);
		member16.setUserName("Christina Berglund");
		member16.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1986-05-15"));
		member16.setGender(1);
		member16.setUserAddress("巴西");

		TeamMember member17 = new TeamMember();
		member17.setUserId(17);
		member17.setTeamId(3);
		member17.setUserName("Hanna Moos");
		member17.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1986-06-25"));
		member17.setGender(1);
		member17.setUserAddress("巴西");

		TeamMember member18 = new TeamMember();
		member18.setUserId(18);
		member18.setTeamId(3);
		member18.setUserName("Martín Sommer");
		member18.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1986-07-07"));
		member18.setGender(1);
		member18.setUserAddress("巴西");

		TeamMember member19 = new TeamMember();
		member19.setUserId(19);
		member19.setTeamId(3);
		member19.setUserName("Laurence Lebihan");
		member19.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1986-08-17"));
		member19.setGender(1);
		member19.setUserAddress("巴西");

		TeamMember member20 = new TeamMember();
		member20.setUserId(20);
		member20.setTeamId(3);
		member20.setUserName("Elizabeth Lincoln");
		member20.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1986-09-27"));
		member20.setGender(1);
		member20.setUserAddress("巴西");

		TeamMember member21 = new TeamMember();
		member21.setUserId(21);
		member21.setTeamId(3);
		member21.setUserName("Victoria Ashworth");
		member21.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1986-10-19"));
		member21.setGender(1);
		member21.setUserAddress("巴西");

		TeamMember member22 = new TeamMember();
		member22.setUserId(22);
		member22.setTeamId(3);
		member22.setUserName("Patricio Simpson");
		member22.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1986-11-29"));
		member22.setGender(1);
		member22.setUserAddress("巴西");

		TeamMember member23 = new TeamMember();
		member23.setUserId(23);
		member23.setTeamId(2);
		member23.setUserName("刘一");
		member23.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1989-01-01"));
		member23.setGender(1);
		member23.setUserAddress("中国");

		TeamMember member24 = new TeamMember();
		member24.setUserId(24);
		member24.setTeamId(2);
		member24.setUserName("陈二");
		member24.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1986-02-11"));
		member24.setGender(1);
		member24.setUserAddress("中国");

		TeamMember member25 = new TeamMember();
		member25.setUserId(25);
		member25.setTeamId(2);
		member25.setUserName("张三");
		member25.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1986-03-21"));
		member25.setGender(1);
		member25.setUserAddress("中国");

		TeamMember member26 = new TeamMember();
		member26.setUserId(26);
		member26.setTeamId(2);
		member26.setUserName("李四");
		member26.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1986-04-05"));
		member26.setGender(1);
		member26.setUserAddress("中国");

		TeamMember member27 = new TeamMember();
		member27.setUserId(27);
		member27.setTeamId(2);
		member27.setUserName("王五");
		member27.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1986-05-15"));
		member27.setGender(1);
		member27.setUserAddress("中国");

		TeamMember member28 = new TeamMember();
		member28.setUserId(28);
		member28.setTeamId(2);
		member28.setUserName("赵六");
		member28.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1986-06-25"));
		member28.setGender(1);
		member28.setUserAddress("中国");

		TeamMember member29 = new TeamMember();
		member29.setUserId(29);
		member29.setTeamId(2);
		member29.setUserName("孙七");
		member29.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1986-07-07"));
		member29.setGender(1);
		member29.setUserAddress("中国");

		TeamMember member30 = new TeamMember();
		member30.setUserId(30);
		member30.setTeamId(2);
		member30.setUserName("周八");
		member30.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1986-08-17"));
		member30.setGender(1);
		member30.setUserAddress("中国");

		TeamMember member31 = new TeamMember();
		member31.setUserId(31);
		member31.setTeamId(2);
		member31.setUserName("吴九");
		member31.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1986-09-27"));
		member31.setGender(1);
		member31.setUserAddress("中国");

		TeamMember member32 = new TeamMember();
		member32.setUserId(32);
		member32.setTeamId(2);
		member32.setUserName("郑十");
		member32.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1986-10-19"));
		member32.setGender(1);
		member32.setUserAddress("中国");

		TeamMember member33 = new TeamMember();
		member33.setUserId(33);
		member33.setTeamId(2);
		member33.setUserName("上官婉儿");
		member33.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1986-11-29"));
		member33.setGender(0);
		member33.setUserAddress("中国");

		List<TeamMember> teamMemberList = new ArrayList<TeamMember>();
		teamMemberList.add(member1);
		teamMemberList.add(member2);
		teamMemberList.add(member3);
		teamMemberList.add(member4);
		teamMemberList.add(member5);
		teamMemberList.add(member6);
		teamMemberList.add(member7);
		teamMemberList.add(member8);
		teamMemberList.add(member9);
		teamMemberList.add(member10);
		teamMemberList.add(member11);
		teamMemberList.add(member12);
		teamMemberList.add(member13);
		teamMemberList.add(member14);
		teamMemberList.add(member15);
		teamMemberList.add(member16);
		teamMemberList.add(member17);
		teamMemberList.add(member18);
		teamMemberList.add(member19);
		teamMemberList.add(member20);
		teamMemberList.add(member21);
		teamMemberList.add(member22);
		teamMemberList.add(member23);
		teamMemberList.add(member24);
		teamMemberList.add(member25);
		teamMemberList.add(member26);
		teamMemberList.add(member27);
		teamMemberList.add(member28);
		teamMemberList.add(member29);
		teamMemberList.add(member30);
		teamMemberList.add(member31);
		teamMemberList.add(member32);
		teamMemberList.add(member33);
		return teamMemberList;
	}

	/**
	 * 保存主键
	 */
	@Test
	public void savePrimaryKeyTest() throws Exception {
		// 存储球队表主键ID
		List<FootballTeam> footballTeam = getFootballTeam();
		Integer[] teamIdArray = footballTeam.stream().map(FootballTeam::getTeamId).toArray(Integer[]::new);
		// 通过JSON实现数组类型的转换
		String teamIdArrayJson = JSON.toJSONString(teamIdArray);
		List<String> teamIdList = JSON.parseObject(teamIdArrayJson, new TypeReference<List<String>>() {
		});
		// 存入redis数据库
		redisClient.savePrimaryKey("FootballTeam", "TeamId", teamIdList);

		/************************************************************/

		// 存储球员表主键ID
		List<TeamMember> teamMember = getTeamMember();
		Integer[] userIdArray = teamMember.stream().map(TeamMember::getUserId).toArray(Integer[]::new);
		// 通过JSON实现数组类型的转换
		String userIdArrayJson = JSON.toJSONString(userIdArray);
		List<String> userIdList = JSON.parseObject(userIdArrayJson, new TypeReference<List<String>>() {
		});
		// 存入redis数据库
		redisClient.savePrimaryKey("TeamMember", "UserId", userIdList);
	}

	/**
	 * 保存每张表的记录
	 */
	@Test
	public void saveRecordTest() throws Exception {
		// 保存球队信息到redis数据库
		List<FootballTeam> footballTeamList = getFootballTeam();
		for (FootballTeam team : footballTeamList) {
			redisClient.saveObject(team, "FootballTeam", team.getTeamId().toString());
		}

		// 保存球员信息到redis数据库
		List<TeamMember> teamMemberList = getTeamMember();
		for (TeamMember member : teamMemberList) {
			redisClient.saveObject(member, "TeamMember", member.getUserId().toString());
		}
	}

	/**
	 * 向redis数据库新增一条表记录
	 */
	@Test
	public void saveObjectTest() {
		// 定义主键字段名
		String pkFieldName = "pid";
		// 定义主键字段值
		String pkFieldValue = "1";

		// 保存数据库表的主键值
		redisClient.savePrimaryKey("products", pkFieldName, pkFieldValue);

		// 向数据库表存储一条记录
		Map<String, String> map = new LinkedHashMap<String, String>();
		map.put(pkFieldName, pkFieldValue);
		map.put("pname", "苹果");
		map.put("category", "水果");
		map.put("price", "23.69");
		map.put("store", "10000");
		map.put("buydate", "2018-12-21");
		redisClient.saveObject(map, "products", pkFieldValue);
	}

	/**
	 * 从redis数据库删除一条表记录
	 */
	@Test
	public void deleteObjectTest() {
		// 定义主键字段名
		String tableName = "TeamMember";
		String pkFieldName = "UserId";
		// 定义主键字段值
		String pkFieldValue = "33";
		// 从外键表删除指定的行记录
		redisClient.deleteObject(tableName, pkFieldName, pkFieldValue);

		// 删除外键关系
		String pkTableName = "FootballTeam";
		String fkTableName = "TeamMember";
		String fkValue = "2";
		String fkTableId = "33";
		redisClient.deleteForeignKeyRelation(pkTableName, fkTableName, fkValue, fkTableId);
	}

	/**
	 * 建立一对多的关系
	 */
	@Test
	public void saveOne2MultipleRelationTest() throws Exception {
		// 球队表
		List<FootballTeam> footballTeam = getFootballTeam();

		// 球员表
		List<TeamMember> teamMemberList = getTeamMember();

		// 球队表主键ID的集合
		Integer[] teamIdArray = footballTeam.stream().map(FootballTeam::getTeamId).toArray(Integer[]::new);
		for (Integer teamId : teamIdArray) {
			Integer[] userIdArray = teamMemberList.stream().filter(term -> term.getTeamId() == teamId)
					.map(TeamMember::getUserId).toArray(Integer[]::new);
			String userIdArrayJson = JSON.toJSONString(userIdArray);
			List<String> userIdList = JSON.parseObject(userIdArrayJson, new TypeReference<List<String>>() {
			});
			redisClient.saveOne2MultipleRelation("FootballTeam", "TeamMember", teamId.toString(), userIdList);
		}
	}

	/**
	 * 查询主键集合
	 */
	@Test
	public void queryPrimaryKeyListTest() {
		List<String> termPKList = redisClient.queryPrimaryKeyFieldValueList("FootballTeam", "TeamId");
		logger.info(termPKList);

		List<String> memberPKList = redisClient.queryPrimaryKeyFieldValueList("TeamMember", "UserId");
		logger.info(memberPKList);
	}

	/**
	 * 查询一条记录
	 */
	@Test
	public void queryForMapObjectTest() {
		Map<String, String> queryRecord = redisClient.queryForObject("FootballTeam", "2");
		logger.info(queryRecord);

		Map<String, String> queryForObject = redisClient.queryForObject("TeamMember", "29");
		logger.info(queryForObject);
	}

	/**
	 * 查询一条记录
	 */
	@Test
	public void queryForObjectTest() throws Exception {
		FootballTeam queryForObject = redisClient.queryForObject("FootballTeam", "2", FootballTeam.class);
		logger.info(queryForObject);

		TeamMember queryForObject2 = redisClient.queryForObject("TeamMember", "15", TeamMember.class);
		logger.info(queryForObject2);
	}

	/**
	 * 查询列表
	 */
	@Test
	public void queryForMapListTest() {
		List<Map<String, String>> footballTeamList = redisClient.queryForList("FootballTeam", "TeamId");
		logger.info(JSON.toJSONString(footballTeamList, SerializerFeature.WRITE_MAP_NULL_FEATURES,
				SerializerFeature.QuoteFieldNames));

		List<Map<String, String>> teamMemberList = redisClient.queryForList("TeamMember", "UserId");
		logger.info(JSON.toJSONString(teamMemberList, SerializerFeature.WRITE_MAP_NULL_FEATURES,
				SerializerFeature.QuoteFieldNames));
	}

	/**
	 * 查询列表
	 */
	@Test
	public void queryForListTest() throws Exception {
		List<FootballTeam> footballTeamList = redisClient.queryForList("FootballTeam", "TeamId", FootballTeam.class);
		logger.info(footballTeamList);

		List<TeamMember> teamMemberList = redisClient.queryForList("TeamMember", "UserId", TeamMember.class);
		logger.info(teamMemberList);
	}

	/**
	 * 获取一位球员的球队信息
	 */
	@Test
	public void getTeamInfoTest() throws Exception {
		// 球员的信息
		TeamMember teamMember = redisClient.queryForObject("TeamMember", "25", TeamMember.class);
		Integer teamId = teamMember.getTeamId();

		// 球队的信息
		FootballTeam footballTeam = redisClient.queryForObject("FootballTeam", teamId.toString(), FootballTeam.class);
		logger.info(footballTeam);
	}

	/**
	 * 查询球队下的所有球员
	 */
	@Test
	public void queryForMapListTest2() {
		List<Map<String, String>> teamMemberList = redisClient.queryForList("FootballTeam", "TeamMember", "2");
		logger.info(JSON.toJSONString(teamMemberList, SerializerFeature.WRITE_MAP_NULL_FEATURES,
				SerializerFeature.QuoteFieldNames));
	}

	/**
	 * 查询球队下的所有球员
	 */
	@Test
	public void queryForListTest2() throws Exception {
		List<TeamMember> teamMemberList = redisClient.queryForList("FootballTeam", "TeamMember", "1", TeamMember.class);
		logger.info(teamMemberList);
	}

}
