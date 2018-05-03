package com.yongdubot.server.mappers;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.yongdubot.server.domain.Members;

@Mapper
public interface MemberMapper {
	@Insert("insert into members(user_key, level, status) values(#{user_key}, 'agent', '정상')")
    int insertMember(Members member);
	
	@Update("update members set name = #{name} where user_key = #{user_key}")
	int updateMemberName(Members member);
	
	@Update("update members set nickname = #{nickname} where user_key = #{user_key}")
	int updateMemberNickName(Members member);
	
    @Select("select * from members WHERE user_key=#{value}")
    Members findMemberByUserkey(String user_key);
    
    @Update("update members set status = '탈퇴' where user_key = #{value}")
    int dropMember(String user_key);
}
