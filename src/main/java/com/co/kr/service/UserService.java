package com.co.kr.service;

import java.util.List;
import java.util.Map;

import com.co.kr.domain.LoginDomain;


public interface UserService {

    public LoginDomain mbSelectList(Map<String, String> map);
    

    public List<LoginDomain> mbAllList(Map<String, Integer> map);
    

    public int mbGetAll();
    

    public void mbCreate(LoginDomain loginDomain);
    

    public LoginDomain mbGetId(Map<String, String> map);
    

    public int mbDuplicationCheck(Map<String, String> map);
    

    public void mbUpdate(LoginDomain loginDomain); 
    

    public void mbRemove(Map<String, String> map); 
    
}