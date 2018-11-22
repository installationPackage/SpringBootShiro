import com.ssm.bdqn.Util.JwtUtil;
import com.ssm.bdqn.controller.UserController;
import com.ssm.bdqn.entity.User;
public class javaText {
    public static void main(String[] args) {
        //        有效期10秒
        //        加密：
        /*String token= JwtUtil.sign(new User(2,"sdf","sdfsdf"),600000);
        System.out.println("加密后"+token);*/
        //        //      解密

        User token2 =  JwtUtil.unsign("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJleHAiOjE1NDA0MzE1NjAyNDksInBheWxvYWQiOiJ7XCJpZFwiOjIsXCJ1c2VyQ29kZVwiOlwic2RmXCIsXCJwYXNzd29yZFwiOlwic2Rmc2RmXCIsXCJ1c2VyTmFtZVwiOm51bGwsXCJzZXhcIjpudWxsLFwiY2xhc3Nlc0lkXCI6bnVsbCxcInR5cGVcIjpudWxsLFwicGhvbmVcIjpudWxsLFwiZW1haWxcIjpudWxsLFwiYWRkcmVzc1wiOm51bGwsXCJjbGFzc2VzXCI6bnVsbH0ifQ.fss6AzxJL6S3cTT9OlbmiEDdR3B8sRX_1HEgR-zhdjE",User.class);
        System.out.println("解密后"+token2);


/*errcode errmge  date*/
    }
}
