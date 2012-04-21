package nz.co.aetheric.syphilis.webapp.auth;

import nz.co.aetheric.syphilis.persist.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/auth")
public class AuthController {
    private static final Logger logger = LoggerFactory.getLogger(AuthController.class);

    @Autowired
    UserDao userDao;

//    /**
//     * Called frequently by the mobile app to validate whether the current user is actually logged in at all.
//     * @param request Command object with an ajax synchroniser.
//     * @return A map containing the authentication status under the key 'loggedIn' and the ajax synchroniser.
//     */
//    @RequestMapping(value = "/check", method = RequestMethod.POST)
//    public @ResponseBody Map checkLogin(@RequestBody BaseAjaxRequest request) {
//        try {
//            return new CheckLoginResponse(request, LoginContext.getUser() != null);
//        } catch(SecurityViolationException e) {
//            return new CheckLoginResponse(request, false);
//        }
//    }

//    /**
//     * Action for logging in a user via ajax.
//     * @param request Command object with username, password, c2dm_reg and an ajax synchroniser.
//     * @return A Map containing the ajax synchroniser.
//     */
//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public @ResponseBody BaseAjaxResponse performLogin(@RequestBody PerformLoginRequest request,
//                                                       HttpServletRequest httpRequest)
//            throws InvalidPasswordException, ObjectNotFoundException, UserDeactivatedException,
//            PermissionDeniedException {
//
//        final HttpSession session = httpRequest.getSession();
//
//        boolean isAndroid = httpRequest.getHeader("user-agent").contains("Android");
//        session.setAttribute("android", isAndroid);
//
//        String error = "";
//
//        UserBean userBean;
//        try {
//            userBean = LoginContext.getUser();
//            error = "User already logged in!";
//            logger.info(error);
//        } catch(SecurityViolationException e) {
//            userBean = LogonHelper.processLogon(httpRequest, request.username, request.password, Feature.MOBILE);
//        }
//        session.setAttribute("loginError", null);
//
//        int refreshInterval = userBean.getRecentMessageLogRefreshInterval();
//        session.setAttribute("refresh", refreshInterval * 1000); // JQM expects this value in milliseconds
//
//        //session.setAttribute(MessageController.MOBILE_START_DATE, new Date());
//
//        userBean.setC2dm(request.c2dm_reg);
//        userDao.save(userBean);
//
//        return new BaseAjaxResponse(request);
//    }

//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    @ExceptionHandler({ InvalidPasswordException.class, UserDeactivatedException.class, ObjectNotFoundException.class,
//            PermissionDeniedException.class })
//    public @ResponseBody ExceptionResponse handleBadlogin(Exception ex, @RequestBody BaseAjaxRequest request) {
//        return new ExceptionResponse(request, ex);
//    }
}