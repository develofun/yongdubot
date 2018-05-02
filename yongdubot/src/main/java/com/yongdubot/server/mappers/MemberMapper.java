package com.yongdubot.server.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.yongdubot.server.domain.Members;

@Mapper
public interface MemberMapper {
	@Insert("insert into members(user_key, level) values(#{user_key}, 'agent')")
    int insertMember(Members member);
	
    @Select("select * from members WHERE user_key=#{value}")
    Members findMemberByUserkey(String user_key);
    
    @Select("select * from members")
    List<Members> findAllMembers();
}
