package com.pacee1.user.service;

import com.pacee1.user.pojo.UserAddress;
import com.pacee1.user.pojo.bo.UserAddressBO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author pace
 * @version v1.0
 * @Type UserService.java
 * @Desc
 * @date 2020/5/17 15:16
 */
@RestController("address-api")
public interface AddressService {

    /**
     * 查
     * @param userId
     * @return
     */
    @GetMapping("addressList")
    List<UserAddress> queryUserAddress(@RequestParam("userId") String userId);

    @PostMapping("address")
    void add(@RequestBody UserAddressBO userAddressBO);

    @PutMapping("address")
    void edit(@RequestBody UserAddressBO userAddressBO);

    @DeleteMapping("address")
    void delete(@RequestBody String userId, String addressId);

    @PostMapping("setDefaultAddress")
    void setDefaultAddress(@RequestParam("userId")String userId,
                           @RequestParam(value = "addressId",required = false)String addressId);

    @GetMapping("address")
    UserAddress queryById(@RequestParam("addressId") String addressId);
}
