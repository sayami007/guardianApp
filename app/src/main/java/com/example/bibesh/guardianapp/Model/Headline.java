package com.example.bibesh.guardianapp.Model;

import java.util.List;

/**
 * Created by Bibesh on 7/14/17.
 */

public class Headline {
    private ResponseBean response;

    public ResponseBean getResponse() {
        return response;
    }

    public void setResponse(ResponseBean response) {
        this.response = response;
    }

    public static class ResponseBean {
        private String status;
        private String userTier;
        private int total;
        private int startIndex;
        private int pageSize;
        private int currentPage;
        private int pages;
        private String orderBy;
        private List<ResultsBean> results;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getUserTier() {
            return userTier;
        }

        public void setUserTier(String userTier) {
            this.userTier = userTier;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getStartIndex() {
            return startIndex;
        }

        public void setStartIndex(int startIndex) {
            this.startIndex = startIndex;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public int getCurrentPage() {
            return currentPage;
        }

        public void setCurrentPage(int currentPage) {
            this.currentPage = currentPage;
        }

        public int getPages() {
            return pages;
        }

        public void setPages(int pages) {
            this.pages = pages;
        }

        public String getOrderBy() {
            return orderBy;
        }

        public void setOrderBy(String orderBy) {
            this.orderBy = orderBy;
        }

        public List<ResultsBean> getResults() {
            return results;
        }

        public void setResults(List<ResultsBean> results) {
            this.results = results;
        }

        public static class ResultsBean {


            private String id;
            private String type;
            private String sectionId;
            private String sectionName;
            private String webPublicationDate;
            private String webTitle;
            private String webUrl;
            private String apiUrl;
            private FieldsBean fields;
            private boolean isHosted;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getSectionId() {
                return sectionId;
            }

            public void setSectionId(String sectionId) {
                this.sectionId = sectionId;
            }

            public String getSectionName() {
                return sectionName;
            }

            public void setSectionName(String sectionName) {
                this.sectionName = sectionName;
            }

            public String getWebPublicationDate() {
                return webPublicationDate;
            }

            public void setWebPublicationDate(String webPublicationDate) {
                this.webPublicationDate = webPublicationDate;
            }

            public String getWebTitle() {
                return webTitle;
            }

            public void setWebTitle(String webTitle) {
                this.webTitle = webTitle;
            }

            public String getWebUrl() {
                return webUrl;
            }

            public void setWebUrl(String webUrl) {
                this.webUrl = webUrl;
            }

            public String getApiUrl() {
                return apiUrl;
            }

            public void setApiUrl(String apiUrl) {
                this.apiUrl = apiUrl;
            }

            public FieldsBean getFields() {
                return fields;
            }

            public void setFields(FieldsBean fields) {
                this.fields = fields;
            }

            public boolean isHosted() {
                return isHosted;
            }

            public void setHosted(boolean hosted) {
                isHosted = hosted;
            }

            public static class FieldsBean {
                private String headline;
                private String shortUrl;
                private String thumbnail;

                public String getHeadline() {
                    return headline;
                }

                public void setHeadline(String headline) {
                    this.headline = headline;
                }

                public String getShortUrl() {
                    return shortUrl;
                }

                public void setShortUrl(String shortUrl) {
                    this.shortUrl = shortUrl;
                }

                public String getThumbnail() {
                    return thumbnail;
                }

                public void setThumbnail(String thumbnail) {
                    this.thumbnail = thumbnail;
                }
            }
        }
    }
}
