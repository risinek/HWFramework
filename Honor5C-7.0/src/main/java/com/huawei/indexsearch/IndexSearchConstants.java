package com.huawei.indexsearch;

public class IndexSearchConstants {
    public static final int CLEAR_USER_DATA_OP = 8;
    public static final int DELETE_OP = 2;
    public static final int FILE_DELETE_OP = 5;
    public static final int FILE_INSERT_OP = 3;
    public static final int FILE_UPDATE_OP = 4;
    public static final int FOLDER_DELETE_OP = 6;
    public static final int HANDLE_CACHE_OP = 7;
    public static final String HWINDEXSEARCHSERVICE_APK_NAME = "com.huawei.indexsearch";
    public static final int INDEX_ANALYZED = 1;
    public static final int INDEX_ANALYZED_NO_NORMS = 4;
    public static final int INDEX_BUILD_FLAG_DB = 16;
    public static final int INDEX_BUILD_FLAG_EXTERNAL_FILE = 48;
    public static final int INDEX_BUILD_FLAG_INTERNAL_FILE = 32;
    public static final int INDEX_BUILD_FLAG_MASK = 240;
    public static final int INDEX_BUILD_OP_MASK = 15;
    public static final int INDEX_NO = 0;
    public static final int INDEX_NOT_ANALYZED = 2;
    public static final int INDEX_NOT_ANALYZED_NO_NORMS = 3;
    public static final int INSERT_OP = 0;
    public static final String MEDIA_PROVIDER_APK_NAME = "com.android.providers.media";
    static final String[] MONITOR_ALL_PACKAGE_NAME = null;
    public static final int STORE_NO = 0;
    public static final int STORE_YES = 1;
    public static final int UPDATE_OP = 1;

    static {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: com.huawei.indexsearch.IndexSearchConstants.<clinit>():void
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:113)
	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:256)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:281)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:161)
Caused by: jadx.core.utils.exceptions.DecodeException:  in method: com.huawei.indexsearch.IndexSearchConstants.<clinit>():void
	at jadx.core.dex.instructions.InsnDecoder.decodeInsns(InsnDecoder.java:46)
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:98)
	... 7 more
Caused by: java.lang.IllegalArgumentException: bogus opcode: 0073
	at com.android.dx.io.OpcodeInfo.get(OpcodeInfo.java:1197)
	at com.android.dx.io.OpcodeInfo.getFormat(OpcodeInfo.java:1212)
	at com.android.dx.io.instructions.DecodedInstruction.decode(DecodedInstruction.java:72)
	at jadx.core.dex.instructions.InsnDecoder.decodeInsns(InsnDecoder.java:43)
	... 8 more
*/
        /*
        // Can't load method instructions.
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.indexsearch.IndexSearchConstants.<clinit>():void");
    }
}
