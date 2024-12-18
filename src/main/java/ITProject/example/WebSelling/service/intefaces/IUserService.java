package ITProject.example.WebSelling.service.intefaces;

import ITProject.example.WebSelling.dto.request.UserRequests.UserRequest;
import ITProject.example.WebSelling.dto.response.UserResponse;

import java.util.List;

public interface IUserService {
     UserResponse save(UserRequest userRequest);


     UserResponse update(UserRequest userRequest, Long id);

     UserResponse getUserById(Long userId);

     void delete(Long userId);

     List<UserResponse> getAllUsers();

     UserResponse findUserByUsername(String username);





}
