package cn.paper_card.ban.api;

@SuppressWarnings("unused")
interface PaperBanApi {

    // 登录检查玩家是否被封禁
    // 应该传入：AsyncPlayerPreLoginEvent对象
    // 如果没有被封禁，传入对象的LoginResult是ALLOWED
    // 如果被封禁则是KICK_BANNED
    // 如果发生异常则是KICK_OTHER
    void onPreLoginCheck(Object event);

}
