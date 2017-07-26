package com.mercury.platform.shared.store;

import com.mercury.platform.core.misc.SoundType;
import com.mercury.platform.core.utils.interceptor.MessageInterceptor;
import com.mercury.platform.shared.FrameVisibleState;
import com.mercury.platform.shared.config.descriptor.HotKeyDescriptor;
import com.mercury.platform.shared.config.descriptor.ProfileDescriptor;
import com.mercury.platform.shared.entity.message.Message;
import com.mercury.platform.shared.config.descriptor.SoundDescriptor;
import lc.kra.system.keyboard.event.GlobalKeyEvent;
import rx.subjects.PublishSubject;


public class MercuryStoreCore {
    public static final PublishSubject<SoundType> soundSubject = PublishSubject.create();
    public static final PublishSubject<SoundDescriptor> soundSettingsSubject = PublishSubject.create();
    public static final PublishSubject<Boolean> dndSubject = PublishSubject.create();
    public static final PublishSubject<FrameVisibleState> frameVisibleSubject = PublishSubject.create();
    public static final PublishSubject<Boolean> uiLoadedSubject = PublishSubject.create();
    public static final PublishSubject<MessageInterceptor> addInterceptorSubject = PublishSubject.create();
    public static final PublishSubject<MessageInterceptor> removeInterceptorSubject = PublishSubject.create();
    public static final PublishSubject<String> chatCommandSubject = PublishSubject.create();
    public static final PublishSubject<String> openChatSubject = PublishSubject.create();
    public static final PublishSubject<Message> messageSubject = PublishSubject.create();
    public static final PublishSubject<Message> outMessageSubject = PublishSubject.create();
    public static final PublishSubject<Boolean> appLoadingSubject = PublishSubject.create();
    public static final PublishSubject<Boolean> showingDelaySubject = PublishSubject.create();
    public static final PublishSubject<String> stringAlertSubject = PublishSubject.create();
    public static final PublishSubject<Boolean> poeFolderChangedSubject = PublishSubject.create();
    public static final PublishSubject<Boolean> checkOutPatchSubject = PublishSubject.create();
    public static final PublishSubject<Integer> chunkLoadedSubject = PublishSubject.create();
    public static final PublishSubject<Boolean> buttonsChangedSubject = PublishSubject.create();
    public static final PublishSubject<String> tooltipSubject = PublishSubject.create();
    public static final PublishSubject<String> notificationSubject = PublishSubject.create();
    public static final PublishSubject<String> playerJoinSubject = PublishSubject.create();
    public static final PublishSubject<String> playerLeftSubject = PublishSubject.create();
    public static final PublishSubject<Boolean> requestPatchSubject = PublishSubject.create();
    public static final PublishSubject<String> showPatchNotesSubject = PublishSubject.create();
    public static final PublishSubject<Boolean> shutdownAppSubject = PublishSubject.create();
    public static final PublishSubject<Boolean> shutdownForUpdateSubject = PublishSubject.create();
    public static final PublishSubject<Boolean> startUpdateSubject = PublishSubject.create();
    public static final PublishSubject<Integer> updateInfoSubject = PublishSubject.create();
    public static final PublishSubject<Boolean> updateReadySubject = PublishSubject.create();
    public static final PublishSubject<Boolean> saveConfigSubject = PublishSubject.create();
    public static final PublishSubject<Boolean> toDefaultSubject = PublishSubject.create();
    public static final PublishSubject<ProfileDescriptor> changeProfileSubject = PublishSubject.create();
    public static final PublishSubject<HotKeyDescriptor> hotKeySubject = PublishSubject.create();
}