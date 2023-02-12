package com.office.user.service;

import com.office.user.VO.Department;
import com.office.user.VO.ResponseTemplateVO;
import com.office.user.entity.User;
import com.office.user.repository.UserRepository;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
       return userRepository.save(user);
    }

    public Optional<User> getUserById(Long id) {
        return Optional.of(userRepository.findById(id).orElseThrow(()-> new ServiceException("user.not.found")));
    }

    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
        Optional<User> user = Optional.of(userRepository.findById(userId).orElseThrow(()-> new ServiceException("not")));

        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVER/department/" + user.get().getDepartmentId() , Department.class);
         responseTemplateVO.setUser(user.get());
         responseTemplateVO.setDepartment(department);
         return responseTemplateVO;
    }
}
