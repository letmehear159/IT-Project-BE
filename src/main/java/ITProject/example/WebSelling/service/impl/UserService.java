package ITProject.example.WebSelling.service.impl;

import ITProject.example.WebSelling.dto.request.UserRequest;
import ITProject.example.WebSelling.dto.response.UserResponse;
import ITProject.example.WebSelling.entity.Role;
import ITProject.example.WebSelling.entity.User;
import ITProject.example.WebSelling.enums.ROLE;
import ITProject.example.WebSelling.mapper.UserMapper;
import ITProject.example.WebSelling.repository.UserRepository;
import ITProject.example.WebSelling.service.intefaces.IUserService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class UserService implements IUserService {

    UserRepository userRepository;
    UserMapper userMapper;
    PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(10);

    @Override
    public UserResponse save(UserRequest userRequest) {

        // Chuyển dữ liệu từ request sang model
        User user = userMapper.toUser(userRequest);

        user.setPassword(passwordEncoder.encode(user.getPassword()));

        //Tạo role trong database sau đó thêm vào đây
//        List<Role> roles = new ArrayList<>();
//
//        roles.add(Role.builder().roleId(ROLE.USER.name()).build());
//
//        user.setRoles(roles);

        return userMapper.toUserResponse(userRepository.save(user));
    }

    @Override
    public User update(UserRequest userRequest) {
        return null;
    }


}
