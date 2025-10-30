package tw.mike.loggerannotationskt

import tw.mike.loggerannotations.EventKey
import tw.mike.loggerannotations.ParamKey

interface Logger {

    @EventKey("login_success")
    fun loginSuccess(
        @ParamKey("method") method: String?,
        @ParamKey("referer") referer: String?
    )

    @EventKey("login_show")
    fun loginShow(
        @ParamKey("position_id") positionId: String?,
        @ParamKey("position_name") positionName: String?,
        @ParamKey("position_page") positionPage: String?,
        @ParamKey("referer") referer: String?
    )

    @EventKey("login_click")
    fun loginClick(
        @ParamKey("method") method: String?,
        @ParamKey("referer") referer: String?
    )

    @EventKey("signup")
    fun signup(
        @ParamKey("method") method: String?,
        @ParamKey("referer") referer: String?
    )

    @EventKey("signup_success")
    fun signupSuccess(
        @ParamKey("method") method: String?,
        @ParamKey("referer") referer: String?
    )

    @EventKey("logout")
    fun logout(
        @ParamKey("position_page") positionPage: String?
    )

    @EventKey("view_album")
    fun viewAlbum(
        @ParamKey("album_id") albumId: String?,
        @ParamKey("album_name") albumName: String?,
        @ParamKey("position_page") positionPage: String?,
        @ParamKey("author") author: String?,
        @ParamKey("group_age") groupAge: String?
    )

    @EventKey("download_album")
    fun downloadAlbum(
        @ParamKey("album_id") albumId: String?,
        @ParamKey("album_name") albumName: String?,
        @ParamKey("author") author: String?,
        @ParamKey("group_age") groupAge: String?
    )

    @EventKey("click_album")
    fun clickAlbum(
        @ParamKey("album_id") albumId: String?,
        @ParamKey("album_name") albumName: String?,
        @ParamKey("position_page") positionPage: String?,
        @ParamKey("position_name") positionName: String?,
        @ParamKey("position_type") positionType: String?,
        @ParamKey("author") author: String?,
        @ParamKey("group_age") groupAge: String?,
        @ParamKey("location_id") locationId: String?
    )

    @EventKey("click_album_introduction")
    fun clickAlbumIntroduction(
        @ParamKey("album_id") albumId: String?,
        @ParamKey("album_name") albumName: String?,
        @ParamKey("author") author: String?,
        @ParamKey("group_age") groupAge: String?
    )

    @EventKey("play_story")
    fun playStory(
        @ParamKey("story_id") storyId: String?,
        @ParamKey("story_name") storyName: String?,
        @ParamKey("album_name") albumName: String?,
        @ParamKey("speed") speed: String?,
        @ParamKey("position_name") positionName: String?,
        @ParamKey("play_type") playType: String?,
        @ParamKey("topic_name") topicName: String?,
        @ParamKey("series_name") seriesName: String?,
        @ParamKey("extend_session") extendSession: String?,
        @ParamKey("source") source: String?,
        @ParamKey("current_time") currentTime: String?
    )

    @EventKey("skip_story")
    fun skipStory(
        @ParamKey("story_id") storyId: String?,
        @ParamKey("story_name") storyName: String?,
        @ParamKey("album_name") albumName: String?,
        @ParamKey("position_name") positionName: String?,
        @ParamKey("speed") speed: String?,
        @ParamKey("current_time") currentTime: String?
    )

    @EventKey("pause_story")
    fun pauseStory(
        @ParamKey("story_id") storyId: String?,
        @ParamKey("story_name") storyName: String?,
        @ParamKey("album_name") albumName: String?,
        @ParamKey("position_name") positionName: String?,
        @ParamKey("speed") speed: String?,
        @ParamKey("current_time") currentTime: String?
    )

    @EventKey("change_story_speed")
    fun changeStorySpeed(
        @ParamKey("story_id") storyId: String?,
        @ParamKey("story_name") storyName: String?,
        @ParamKey("album_name") albumName: String?,
        @ParamKey("origin") origin: String?,
        @ParamKey("modified") modified: String?,
        @ParamKey("current_time") currentTime: String?
    )

    @EventKey("drag_story")
    fun dragStory(
        @ParamKey("story_id") storyId: String?,
        @ParamKey("story_name") storyName: String?,
        @ParamKey("album_name") albumName: String?,
        @ParamKey("position_name") positionName: String?,
        @ParamKey("speed") speed: String?,
        @ParamKey("current_time") currentTime: String?,
        @ParamKey("drag_to_time") dragToTime: String?
    )

    @EventKey("end_story")
    fun endStory(
        @ParamKey("story_id") storyId: String?,
        @ParamKey("story_name") storyName: String?,
        @ParamKey("album_name") albumName: String?,
        @ParamKey("speed") speed: String?,
        @ParamKey("play_type") playType: String?,
        @ParamKey("topic_name") topicName: String?,
        @ParamKey("series_name") seriesName: String?,
        @ParamKey("current_time") currentTime: String?
    )

    @EventKey("story_listencomplete")
    fun storyListencomplete(
        @ParamKey("story_id") storyId: String?,
        @ParamKey("story_name") storyName: String?,
        @ParamKey("album_name") albumName: String?,
        @ParamKey("topic_name") topicName: String?,
        @ParamKey("series_name") seriesName: String?,
        @ParamKey("author") author: String?,
        @ParamKey("group_age") groupAge: String?
    )

    @EventKey("download_story")
    fun downloadStory(
        @ParamKey("story_id") storyId: String?,
        @ParamKey("story_name") storyName: String?,
        @ParamKey("album_name") albumName: String?,
        @ParamKey("position_name") positionName: String?
    )

    @EventKey("play_story_source")
    fun playStorySource(
        @ParamKey("referral") referral: String?
    )

    @EventKey("set_timer")
    fun setTimer(
        @ParamKey("story_id") storyId: String?,
        @ParamKey("story_name") storyName: String?,
        @ParamKey("album_name") albumName: String?,
        @ParamKey("type_name") typeName: String?
    )

    @EventKey("view_storylist")
    fun viewStorylist(
        @ParamKey("id") id: String?,
        @ParamKey("name") name: String?
    )

    @EventKey("create_storylist")
    fun createStorylist(
        @ParamKey("id") id: String?,
        @ParamKey("name") name: String?
    )

    @EventKey("rename_storylist")
    fun renameStorylist(
        @ParamKey("id") id: String?,
        @ParamKey("name") name: String?
    )

    @EventKey("remove_storylist")
    fun removeStorylist(
        @ParamKey("id") id: String?,
        @ParamKey("name") name: String?
    )

    @EventKey("download_storylist")
    fun downloadStorylist(
        @ParamKey("id") id: String?,
        @ParamKey("name") name: String?,
        @ParamKey("position_page") positionPage: String?
    )

    @EventKey("add_story_to_storylist")
    fun addStoryToStorylist(
        @ParamKey("story_id") storyId: String?,
        @ParamKey("story_name") storyName: String?,
        @ParamKey("album_name") albumName: String?,
        @ParamKey("id") id: String?,
        @ParamKey("name") name: String?
    )

    @EventKey("add_album_to_storylist")
    fun addAlbumToStorylist(
        @ParamKey("album_id") albumId: String?,
        @ParamKey("album_name") albumName: String?,
        @ParamKey("id") id: String?,
        @ParamKey("name") name: String?,
        @ParamKey("author") author: String?,
        @ParamKey("group_age") groupAge: String?
    )

    @EventKey("add_celebrity_to_storylist")
    fun addCelebrityToStorylist(
        @ParamKey("celebrity_id") celebrityId: String?,
        @ParamKey("celebrity_name") celebrityName: String?,
        @ParamKey("id") id: String?,
        @ParamKey("name") name: String?
    )

    @EventKey("remove_story_from_storylist")
    fun removeStoryFromStorylist(
        @ParamKey("story_id") storyId: String?,
        @ParamKey("story_name") storyName: String?,
        @ParamKey("id") id: String?,
        @ParamKey("name") name: String?
    )

    @EventKey("sort_storylist")
    fun sortStorylist(
        @ParamKey("id") id: String?,
        @ParamKey("name") name: String?
    )

    @EventKey("add_gallery_to_storylist")
    fun addGalleryToStorylist(
        @ParamKey("gallery_id") galleryId: String?,
        @ParamKey("gallery_name") galleryName: String?,
        @ParamKey("id") id: String?,
        @ParamKey("name") name: String?
    )

    @EventKey("add_playlist_to_storylist")
    fun addPlaylistToStorylist(
        @ParamKey("gallery_id") galleryId: String?,
        @ParamKey("gallery_name") galleryName: String?,
        @ParamKey("id") id: String?,
        @ParamKey("name") name: String?
    )

    @EventKey("change_sort_storylist")
    fun changeSortStorylist(
        @ParamKey("type_name") typeName: String?
    )

    @EventKey("view_interactive_story")
    fun viewInteractiveStory(
        @ParamKey("id") id: String?,
        @ParamKey("name") name: String?
    )

    @EventKey("play_interactive_story")
    fun playInteractiveStory(
        @ParamKey("id") id: String?,
        @ParamKey("name") name: String?
    )

    @EventKey("finish_interactive_story")
    fun finishInteractiveStory(
        @ParamKey("id") id: String?,
        @ParamKey("name") name: String?
    )

    @EventKey("interactive_story_listencomplete")
    fun interactiveStoryListencomplete(
        @ParamKey("story_id") storyId: String?,
        @ParamKey("story_name") storyName: String?
    )

    @EventKey("view_recommend")
    fun viewRecommend(
        @ParamKey("position_id") positionId: String?,
        @ParamKey("position_name") positionName: String?,
        @ParamKey("album_id") albumId: String?,
        @ParamKey("album_name") albumName: String?,
        @ParamKey("location_id") locationId: String?,
        @ParamKey("referral") referral: String?
    )

    @EventKey("select_recommend")
    fun selectRecommend(
        @ParamKey("position_id") positionId: String?,
        @ParamKey("position_name") positionName: String?,
        @ParamKey("album_id") albumId: String?,
        @ParamKey("album_name") albumName: String?,
        @ParamKey("location_id") locationId: String?,
        @ParamKey("referral") referral: String?
    )

    @EventKey("click_topic")
    fun clickTopic(
        @ParamKey("topic_id") topicId: String?,
        @ParamKey("topic_name") topicName: String?,
        @ParamKey("location_id") locationId: String?
    )

    @EventKey("app_notification_open")
    fun appNotificationOpen(
        @ParamKey("name") name: String?,
        @ParamKey("time") time: String?
    )

    @EventKey("app_notification_receive")
    fun appNotificationReceive(
        @ParamKey("name") name: String?,
        @ParamKey("time") time: String?,
        @ParamKey("referral") referral: String?
    )

    @EventKey("search")
    fun search(
        @ParamKey("search_term") searchTerm: String?,
        @ParamKey("referral") referral: String?
    )

    @EventKey("click_voice_search")
    fun clickVoiceSearch(
        @ParamKey("position_page") positionPage: String?
    )

    @EventKey("click_search")
    fun clickSearch(
        @ParamKey("position_page") positionPage: String?
    )

    @EventKey("search_failed")
    fun searchFailed(
        @ParamKey("search_term") searchTerm: String?
    )

    @EventKey("view_home")
    fun viewHome(
        @ParamKey("position_page") positionPage: String?,
        @ParamKey("location_id") locationId: String?,
        @ParamKey("position_type") positionType: String?,
        @ParamKey("position_title") positionTitle: String?,
        @ParamKey("position_id") positionId: String?,
        @ParamKey("position_name") positionName: String?,
        @ParamKey("index") index: String?
    )

    @EventKey("click_home")
    fun clickHome(
        @ParamKey("position_page") positionPage: String?,
        @ParamKey("location_id") locationId: String?,
        @ParamKey("position_type") positionType: String?,
        @ParamKey("position_title") positionTitle: String?,
        @ParamKey("position_id") positionId: String?,
        @ParamKey("position_name") positionName: String?,
        @ParamKey("index") index: String?,
        @ParamKey("referral") referral: String?
    )

    @EventKey("notifications_center_click")
    fun notificationsCenterClick(
        @ParamKey("???") ???: String?
    )

    @EventKey("notifications_type_click")
    fun notificationsTypeClick(
        @ParamKey("type_name") typeName: String?,
        @ParamKey("type_id") typeId: String?
    )

    @EventKey("notifications_click")
    fun notificationsClick(
        @ParamKey("type_name") typeName: String?,
        @ParamKey("type_id") typeId: String?,
        @ParamKey("id") id: String?,
        @ParamKey("name") name: String?
    )

    @EventKey("notifications_newest_click")
    fun notificationsNewestClick(
        @ParamKey("id") id: String?,
        @ParamKey("name") name: String?
    )

    @EventKey("notifications_all_read")
    fun notificationsAllRead(
        @ParamKey("type_name") typeName: String?,
        @ParamKey("type_id") typeId: String?
    )

    @EventKey("notifications_link_click")
    fun notificationsLinkClick(
        @ParamKey("type_name") typeName: String?,
        @ParamKey("type_id") typeId: String?,
        @ParamKey("id") id: String?,
        @ParamKey("name") name: String?
    )

    @EventKey("notifications_cell_click")
    fun notificationsCellClick(
        @ParamKey("id") id: String?,
        @ParamKey("name") name: String?,
        @ParamKey("target_type") targetType: String?,
        @ParamKey("target_name") targetName: String?,
        @ParamKey("target_id") targetId: String?
    )

    @EventKey("notification_setting")
    fun notificationSetting(
        @ParamKey("modified") modified: String?,
        @ParamKey("firebase_app_id") firebaseAppId: String?
    )

    @EventKey("onboarding_welcome")
    fun onboardingWelcome(
        @ParamKey("position_name") positionName: String?
    )

    @EventKey("onboarding_family")
    fun onboardingFamily(
        @ParamKey("onboarding_family") onboardingFamily: String?
    )

    @EventKey("view_quset_campaign")
    fun viewQusetCampaign(
        @ParamKey("name") name: String?,
        @ParamKey("id") id: String?,
        @ParamKey("referral") referral: String?
    )

    @EventKey("quest_button_click")
    fun questButtonClick(
        @ParamKey("name") name: String?,
        @ParamKey("id") id: String?,
        @ParamKey("type_name") typeName: String?,
        @ParamKey("position_name") positionName: String?
    )

    @EventKey("view_quset_shadow")
    fun viewQusetShadow(
        @ParamKey("name") name: String?,
        @ParamKey("id") id: String?,
        @ParamKey("referral") referral: String?
    )

    @EventKey("quset_shadow_click")
    fun qusetShadowClick(
        @ParamKey("name") name: String?,
        @ParamKey("id") id: String?,
        @ParamKey("position_name") positionName: String?
    )

    @EventKey("quest_badge_click")
    fun questBadgeClick(
        @ParamKey("name") name: String?,
        @ParamKey("id") id: String?,
        @ParamKey("position_name") positionName: String?,
        @ParamKey("position_type") positionType: String?
    )

    @EventKey("quset_shadow_finish")
    fun qusetShadowFinish(
        @ParamKey("name") name: String?,
        @ParamKey("id") id: String?
    )

    @EventKey("quest_award_click")
    fun questAwardClick(
        @ParamKey("name") name: String?,
        @ParamKey("id") id: String?
    )

    @EventKey("quest_award_download")
    fun questAwardDownload(
        @ParamKey("name") name: String?,
        @ParamKey("id") id: String?
    )

    @EventKey("cardlist_click")
    fun cardlistClick(
        @ParamKey("position_type") positionType: String?,
        @ParamKey("position_name") positionName: String?,
        @ParamKey("title") title: String?,
        @ParamKey("target_type") targetType: String?,
        @ParamKey("target_name") targetName: String?,
        @ParamKey("target_id") targetId: String?
    )

    @EventKey("bind")
    fun bind(
        @ParamKey("method") method: String?
    )

    @EventKey("unbind")
    fun unbind(
        @ParamKey("method") method: String?
    )

    @EventKey("share_click")
    fun shareClick(
        @ParamKey("position_type") positionType: String?,
        @ParamKey("position_name") positionName: String?
    )

    @EventKey("share_list_click")
    fun shareListClick(
        @ParamKey("method") method: String?,
        @ParamKey("position_type") positionType: String?,
        @ParamKey("position_name") positionName: String?
    )

    @EventKey("shared_playlist_view")
    fun sharedPlaylistView(
        @ParamKey("id") id: String?,
        @ParamKey("name") name: String?
    )

    @EventKey("app_link_open")
    fun appLinkOpen(
        @ParamKey("position_type") positionType: String?,
        @ParamKey("position_name") positionName: String?,
        @ParamKey("referral") referral: String?
    )

    @EventKey("labelCardList_click")
    fun labelcardlistClick(
        @ParamKey("position_page") positionPage: String?,
        @ParamKey("position_type") positionType: String?,
        @ParamKey("id") id: String?,
        @ParamKey("type_name") typeName: String?,
        @ParamKey("name") name: String?
    )

    @EventKey("bannerList_click")
    fun bannerlistClick(
        @ParamKey("position_page") positionPage: String?,
        @ParamKey("name") name: String?,
        @ParamKey("id") id: String?,
        @ParamKey("type_name") typeName: String?
    )

    @EventKey("specialPick_click")
    fun specialpickClick(
        @ParamKey("position_page") positionPage: String?,
        @ParamKey("position_type") positionType: String?,
        @ParamKey("id") id: String?,
        @ParamKey("type_name") typeName: String?,
        @ParamKey("name") name: String?
    )

    @EventKey("verticalCardList_click")
    fun verticalcardlistClick(
        @ParamKey("id") id: String?,
        @ParamKey("name") name: String?,
        @ParamKey("group_age") groupAge: String?,
        @ParamKey("type_name") typeName: String?,
        @ParamKey("position_type") positionType: String?,
        @ParamKey("position_page") positionPage: String?
    )

    @EventKey("circleCardList_click")
    fun circlecardlistClick(
        @ParamKey("position_page") positionPage: String?,
        @ParamKey("position_type") positionType: String?,
        @ParamKey("id") id: String?,
        @ParamKey("type_name") typeName: String?,
        @ParamKey("name") name: String?
    )

    @EventKey("rankCardList_click")
    fun rankcardlistClick(
        @ParamKey("position_page") positionPage: String?,
        @ParamKey("position_type") positionType: String?,
        @ParamKey("id") id: String?,
        @ParamKey("type_name") typeName: String?,
        @ParamKey("name") name: String?
    )

    @EventKey("eventCardList_click")
    fun eventcardlistClick(
        @ParamKey("position_page") positionPage: String?,
        @ParamKey("position_type") positionType: String?,
        @ParamKey("id") id: String?,
        @ParamKey("type_name") typeName: String?,
        @ParamKey("name") name: String?
    )

    @EventKey("bulletCardList_click")
    fun bulletcardlistClick(
        @ParamKey("position_page") positionPage: String?,
        @ParamKey("position_type") positionType: String?,
        @ParamKey("id") id: String?,
        @ParamKey("type_name") typeName: String?,
        @ParamKey("name") name: String?
    )

    @EventKey("section_icon_click")
    fun sectionIconClick(
        @ParamKey("position_page") positionPage: String?,
        @ParamKey("position_type") positionType: String?
    )

    @EventKey("character_click")
    fun characterClick(
        @ParamKey("id") id: String?,
        @ParamKey("name") name: String?
    )

    @EventKey("subscription_popup_view")
    fun subscriptionPopupView(
        @ParamKey("position_title") positionTitle: String?,
        @ParamKey("position_page") positionPage: String?,
        @ParamKey("position_type") positionType: String?
    )

    @EventKey("subscription_button_click")
    fun subscriptionButtonClick(
        @ParamKey("position_name") positionName: String?,
        @ParamKey("position_page") positionPage: String?,
        @ParamKey("position_type") positionType: String?
    )

    @EventKey("imageCardList_click")
    fun imagecardlistClick(
        @ParamKey("id") id: String?,
        @ParamKey("type_name") typeName: String?,
        @ParamKey("name") name: String?,
        @ParamKey("position_page") positionPage: String?,
        @ParamKey("position_type") positionType: String?
    )

    @EventKey("celebrity_click")
    fun celebrityClick(
        @ParamKey("id") id: String?,
        @ParamKey("name") name: String?
    )

    @EventKey("specialEntrance_click")
    fun specialentranceClick(
        @ParamKey("type_name") typeName: String?
    )

    @EventKey("doubleLabelCardList_click")
    fun doublelabelcardlistClick(
        @ParamKey("id") id: String?,
        @ParamKey("type_name") typeName: String?,
        @ParamKey("name") name: String?,
        @ParamKey("position_page") positionPage: String?,
        @ParamKey("position_type") positionType: String?
    )

    @EventKey("subscription_optional_view")
    fun subscriptionOptionalView(
        @ParamKey("position_title") positionTitle: String?,
        @ParamKey("position_page") positionPage: String?,
        @ParamKey("position_type") positionType: String?
    )

    @EventKey("subscription_optional_click")
    fun subscriptionOptionalClick(
        @ParamKey("position_title") positionTitle: String?,
        @ParamKey("position_page") positionPage: String?,
        @ParamKey("position_type") positionType: String?
    )

    @EventKey("signup_popup_view")
    fun signupPopupView(
        @ParamKey("position_title") positionTitle: String?,
        @ParamKey("position_page") positionPage: String?,
        @ParamKey("position_type") positionType: String?
    )

    @EventKey("signup_popup_click")
    fun signupPopupClick(
        @ParamKey("position_title") positionTitle: String?,
        @ParamKey("position_page") positionPage: String?,
        @ParamKey("position_type") positionType: String?
    )

    @EventKey("subscription_required_view")
    fun subscriptionRequiredView(
        @ParamKey("position_title") positionTitle: String?,
        @ParamKey("position_page") positionPage: String?,
        @ParamKey("position_type") positionType: String?,
        @ParamKey("story_name") storyName: String?,
        @ParamKey("album_name") albumName: String?
    )

    @EventKey("subscription_required_click")
    fun subscriptionRequiredClick(
        @ParamKey("position_title") positionTitle: String?,
        @ParamKey("position_page") positionPage: String?,
        @ParamKey("position_type") positionType: String?,
        @ParamKey("story_name") storyName: String?,
        @ParamKey("album_name") albumName: String?
    )

    @EventKey("topic_click")
    fun topicClick(
        @ParamKey("id") id: String?,
        @ParamKey("topic_name") topicName: String?
    )

    @EventKey("series_click")
    fun seriesClick(
        @ParamKey("id") id: String?,
        @ParamKey("series_name") seriesName: String?,
        @ParamKey("referer") referer: String?
    )

    @EventKey("ageranking_group_click")
    fun agerankingGroupClick(
        @ParamKey("position_type") positionType: String?
    )

}
