/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nageoffer.shortlink.project.common.constant;

/**
 * @ClassName ShortLinkConstant
 * @Description 短链接常量类
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/12/06
 */
public class ShortLinkConstant {

    /**
     * 永久短链接默认缓存有效时间，默认一个月
     */
    public static final long DEFAULT_CACHE_VALID_TIME = 2626560000L;

    /**
     * 高德获取地区接口地址
     */
    public static final String AMAP_REMOTE_URL = "https://restapi.amap.com/v3/ip";
}
