package com.ed.will.fanweather.model;


import java.util.List;

public class Weather{
    /**
     * errNum : 0
     * errMsg : success
     * retData : {"city":"郑州","cityid":"101180101","today":{"date":"2016-03-07","week":"星期一","curTemp":"9℃","aqi":"329","fengxiang":"东北风","fengli":"3-4级","hightemp":"16℃","lowtemp":"5℃","type":"阴","index":[{"name":"感冒指数","code":"gm","index":"","details":"昼夜温差较大，较易发生感冒，请适当增减衣服。体质较弱的朋友请注意防护。","otherName":""},{"code":"fs","details":"属弱紫外辐射天气，长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。","index":"弱","name":"防晒指数","otherName":""},{"code":"ct","details":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。","index":"较冷","name":"穿衣指数","otherName":""},{"code":"yd","details":"阴天，较适宜进行各种户内外运动。","index":"较适宜","name":"运动指数","otherName":""},{"code":"xc","details":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。","index":"较适宜","name":"洗车指数","otherName":""},{"code":"ls","details":"天气阴沉，不利于水分的迅速蒸发，不太适宜晾晒。若需要晾晒，请尽量选择通风的地点。","index":"不太适宜","name":"晾晒指数","otherName":""}]},"forecast":[{"date":"2016-03-08","week":"星期二","fengxiang":"东北风","fengli":"4-5级","hightemp":"8℃","lowtemp":"2℃","type":"小雨"},{"date":"2016-03-09","week":"星期三","fengxiang":"东北风","fengli":"3-4级","hightemp":"5℃","lowtemp":"0℃","type":"阴"},{"date":"2016-03-10","week":"星期四","fengxiang":"无持续风向","fengli":"微风级","hightemp":"10℃","lowtemp":"0℃","type":"多云"},{"date":"2016-03-11","week":"星期五","fengxiang":"无持续风向","fengli":"微风级","hightemp":"12℃","lowtemp":"1℃","type":"多云"}],"history":[{"date":"2016-02-29","week":"星期一","aqi":"85","fengxiang":"无持续风向","fengli":"微风级","hightemp":"11℃","lowtemp":"1℃","type":"晴"},{"date":"2016-03-01","week":"星期二","aqi":"142","fengxiang":"无持续风向","fengli":"微风级","hightemp":"15℃","lowtemp":"5℃","type":"晴"},{"date":"2016-03-02","week":"星期三","aqi":"81","fengxiang":"无持续风向","fengli":"微风级","hightemp":"22℃","lowtemp":"7℃","type":"晴"},{"date":"2016-03-03","week":"星期四","aqi":"112","fengxiang":"无持续风向","fengli":"微风级","hightemp":"25℃","lowtemp":"8℃","type":"晴"},{"date":"2016-03-04","week":"星期五","aqi":"265","fengxiang":"无持续风向","fengli":"微风级","hightemp":"23℃","lowtemp":"8℃","type":"多云"},{"date":"2016-03-05","week":"星期六","aqi":"239","fengxiang":"无持续风向","fengli":"微风级","hightemp":"17℃","lowtemp":"5℃","type":"多云"},{"date":"2016-03-06","week":"星期天","aqi":"204","fengxiang":"无持续风向","fengli":"微风级","hightemp":"17℃","lowtemp":"6℃","type":"多云"}]}
     */

    private int errNum;
    private String errMsg;
    /**
     * city : 郑州
     * cityid : 101180101
     * today : {"date":"2016-03-07","week":"星期一","curTemp":"9℃","aqi":"329","fengxiang":"东北风","fengli":"3-4级","hightemp":"16℃","lowtemp":"5℃","type":"阴","index":[{"name":"感冒指数","code":"gm","index":"","details":"昼夜温差较大，较易发生感冒，请适当增减衣服。体质较弱的朋友请注意防护。","otherName":""},{"code":"fs","details":"属弱紫外辐射天气，长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。","index":"弱","name":"防晒指数","otherName":""},{"code":"ct","details":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。","index":"较冷","name":"穿衣指数","otherName":""},{"code":"yd","details":"阴天，较适宜进行各种户内外运动。","index":"较适宜","name":"运动指数","otherName":""},{"code":"xc","details":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。","index":"较适宜","name":"洗车指数","otherName":""},{"code":"ls","details":"天气阴沉，不利于水分的迅速蒸发，不太适宜晾晒。若需要晾晒，请尽量选择通风的地点。","index":"不太适宜","name":"晾晒指数","otherName":""}]}
     * forecast : [{"date":"2016-03-08","week":"星期二","fengxiang":"东北风","fengli":"4-5级","hightemp":"8℃","lowtemp":"2℃","type":"小雨"},{"date":"2016-03-09","week":"星期三","fengxiang":"东北风","fengli":"3-4级","hightemp":"5℃","lowtemp":"0℃","type":"阴"},{"date":"2016-03-10","week":"星期四","fengxiang":"无持续风向","fengli":"微风级","hightemp":"10℃","lowtemp":"0℃","type":"多云"},{"date":"2016-03-11","week":"星期五","fengxiang":"无持续风向","fengli":"微风级","hightemp":"12℃","lowtemp":"1℃","type":"多云"}]
     * history : [{"date":"2016-02-29","week":"星期一","aqi":"85","fengxiang":"无持续风向","fengli":"微风级","hightemp":"11℃","lowtemp":"1℃","type":"晴"},{"date":"2016-03-01","week":"星期二","aqi":"142","fengxiang":"无持续风向","fengli":"微风级","hightemp":"15℃","lowtemp":"5℃","type":"晴"},{"date":"2016-03-02","week":"星期三","aqi":"81","fengxiang":"无持续风向","fengli":"微风级","hightemp":"22℃","lowtemp":"7℃","type":"晴"},{"date":"2016-03-03","week":"星期四","aqi":"112","fengxiang":"无持续风向","fengli":"微风级","hightemp":"25℃","lowtemp":"8℃","type":"晴"},{"date":"2016-03-04","week":"星期五","aqi":"265","fengxiang":"无持续风向","fengli":"微风级","hightemp":"23℃","lowtemp":"8℃","type":"多云"},{"date":"2016-03-05","week":"星期六","aqi":"239","fengxiang":"无持续风向","fengli":"微风级","hightemp":"17℃","lowtemp":"5℃","type":"多云"},{"date":"2016-03-06","week":"星期天","aqi":"204","fengxiang":"无持续风向","fengli":"微风级","hightemp":"17℃","lowtemp":"6℃","type":"多云"}]
     */

    private RetDataEntity retData;

    public void setErrNum(int errNum) {
        this.errNum = errNum;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public void setRetData(RetDataEntity retData) {
        this.retData = retData;
    }

    public int getErrNum() {
        return errNum;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public RetDataEntity getRetData() {
        return retData;
    }

    public static class RetDataEntity {
        private String city;
        private String cityid;
        /**
         * date : 2016-03-07
         * week : 星期一
         * curTemp : 9℃
         * aqi : 329
         * fengxiang : 东北风
         * fengli : 3-4级
         * hightemp : 16℃
         * lowtemp : 5℃
         * type : 阴
         * index : [{"name":"感冒指数","code":"gm","index":"","details":"昼夜温差较大，较易发生感冒，请适当增减衣服。体质较弱的朋友请注意防护。","otherName":""},{"code":"fs","details":"属弱紫外辐射天气，长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。","index":"弱","name":"防晒指数","otherName":""},{"code":"ct","details":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。","index":"较冷","name":"穿衣指数","otherName":""},{"code":"yd","details":"阴天，较适宜进行各种户内外运动。","index":"较适宜","name":"运动指数","otherName":""},{"code":"xc","details":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。","index":"较适宜","name":"洗车指数","otherName":""},{"code":"ls","details":"天气阴沉，不利于水分的迅速蒸发，不太适宜晾晒。若需要晾晒，请尽量选择通风的地点。","index":"不太适宜","name":"晾晒指数","otherName":""}]
         */

        private TodayEntity today;
        /**
         * date : 2016-03-08
         * week : 星期二
         * fengxiang : 东北风
         * fengli : 4-5级
         * hightemp : 8℃
         * lowtemp : 2℃
         * type : 小雨
         */

        private List<ForecastEntity> forecast;
        /**
         * date : 2016-02-29
         * week : 星期一
         * aqi : 85
         * fengxiang : 无持续风向
         * fengli : 微风级
         * hightemp : 11℃
         * lowtemp : 1℃
         * type : 晴
         */

        private List<HistoryEntity> history;

        public void setCity(String city) {
            this.city = city;
        }

        public void setCityid(String cityid) {
            this.cityid = cityid;
        }

        public void setToday(TodayEntity today) {
            this.today = today;
        }

        public void setForecast(List<ForecastEntity> forecast) {
            this.forecast = forecast;
        }

        public void setHistory(List<HistoryEntity> history) {
            this.history = history;
        }

        public String getCity() {
            return city;
        }

        public String getCityid() {
            return cityid;
        }

        public TodayEntity getToday() {
            return today;
        }

        public List<ForecastEntity> getForecast() {
            return forecast;
        }

        public List<HistoryEntity> getHistory() {
            return history;
        }

        public static class TodayEntity {
            private String date;
            private String week;
            private String curTemp;
            private String aqi;
            private String fengxiang;
            private String fengli;
            private String hightemp;
            private String lowtemp;
            private String type;
            /**
             * name : 感冒指数
             * code : gm
             * index :
             * details : 昼夜温差较大，较易发生感冒，请适当增减衣服。体质较弱的朋友请注意防护。
             * otherName :
             */

            private List<IndexEntity> index;

            public void setDate(String date) {
                this.date = date;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public void setCurTemp(String curTemp) {
                this.curTemp = curTemp;
            }

            public void setAqi(String aqi) {
                this.aqi = aqi;
            }

            public void setFengxiang(String fengxiang) {
                this.fengxiang = fengxiang;
            }

            public void setFengli(String fengli) {
                this.fengli = fengli;
            }

            public void setHightemp(String hightemp) {
                this.hightemp = hightemp;
            }

            public void setLowtemp(String lowtemp) {
                this.lowtemp = lowtemp;
            }

            public void setType(String type) {
                this.type = type;
            }

            public void setIndex(List<IndexEntity> index) {
                this.index = index;
            }

            public String getDate() {
                return date;
            }

            public String getWeek() {
                return week;
            }

            public String getCurTemp() {
                return curTemp;
            }

            public String getAqi() {
                return aqi;
            }

            public String getFengxiang() {
                return fengxiang;
            }

            public String getFengli() {
                return fengli;
            }

            public String getHightemp() {
                return hightemp;
            }

            public String getLowtemp() {
                return lowtemp;
            }

            public String getType() {
                return type;
            }

            public List<IndexEntity> getIndex() {
                return index;
            }

            public static class IndexEntity {
                private String name;
                private String code;
                private String index;
                private String details;
                private String otherName;

                public void setName(String name) {
                    this.name = name;
                }

                public void setCode(String code) {
                    this.code = code;
                }

                public void setIndex(String index) {
                    this.index = index;
                }

                public void setDetails(String details) {
                    this.details = details;
                }

                public void setOtherName(String otherName) {
                    this.otherName = otherName;
                }

                public String getName() {
                    return name;
                }

                public String getCode() {
                    return code;
                }

                public String getIndex() {
                    return index;
                }

                public String getDetails() {
                    return details;
                }

                public String getOtherName() {
                    return otherName;
                }
            }
        }

        public static class ForecastEntity {
            private String date;
            private String week;
            private String fengxiang;
            private String fengli;
            private String hightemp;
            private String lowtemp;
            private String type;

            public void setDate(String date) {
                this.date = date;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public void setFengxiang(String fengxiang) {
                this.fengxiang = fengxiang;
            }

            public void setFengli(String fengli) {
                this.fengli = fengli;
            }

            public void setHightemp(String hightemp) {
                this.hightemp = hightemp;
            }

            public void setLowtemp(String lowtemp) {
                this.lowtemp = lowtemp;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getDate() {
                return date;
            }

            public String getWeek() {
                return week;
            }

            public String getFengxiang() {
                return fengxiang;
            }

            public String getFengli() {
                return fengli;
            }

            public String getHightemp() {
                return hightemp;
            }

            public String getLowtemp() {
                return lowtemp;
            }

            public String getType() {
                return type;
            }
        }

        public static class HistoryEntity {
            private String date;
            private String week;
            private String aqi;
            private String fengxiang;
            private String fengli;
            private String hightemp;
            private String lowtemp;
            private String type;

            public void setDate(String date) {
                this.date = date;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public void setAqi(String aqi) {
                this.aqi = aqi;
            }

            public void setFengxiang(String fengxiang) {
                this.fengxiang = fengxiang;
            }

            public void setFengli(String fengli) {
                this.fengli = fengli;
            }

            public void setHightemp(String hightemp) {
                this.hightemp = hightemp;
            }

            public void setLowtemp(String lowtemp) {
                this.lowtemp = lowtemp;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getDate() {
                return date;
            }

            public String getWeek() {
                return week;
            }

            public String getAqi() {
                return aqi;
            }

            public String getFengxiang() {
                return fengxiang;
            }

            public String getFengli() {
                return fengli;
            }

            public String getHightemp() {
                return hightemp;
            }

            public String getLowtemp() {
                return lowtemp;
            }

            public String getType() {
                return type;
            }
        }
    }
}