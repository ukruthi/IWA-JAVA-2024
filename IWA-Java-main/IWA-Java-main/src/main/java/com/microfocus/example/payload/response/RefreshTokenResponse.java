/*
        Insecure Web App (IWA)

        Copyright 2020-2023 Open Text or one of its affiliates.

        This program is free software: you can redistribute it and/or modify
        it under the terms of the GNU General Public License as published by
        the Free Software Foundation, either version 3 of the License, or
        (at your option) any later version.

        This program is distributed in the hope that it will be useful,
        but WITHOUT ANY WARRANTY; without even the implied warranty of
        MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
        GNU General Public License for more details.

        You should have received a copy of the GNU General Public License
        along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.microfocus.example.payload.response;

public class RefreshTokenResponse {
    private String token;
    private String refreshToken;
    private long expiration;


    public RefreshTokenResponse(String accessToken, String refreshToken, long expiration) {
        this.token = accessToken;
        this.refreshToken = refreshToken;
        this.expiration = expiration;
    }

    public String getAccessToken() {
        return token;
    }

    public void setAccessToken(String accessToken) {
        this.token = accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshTokenToken(String refreshToken) {
        this.token = refreshToken;
    }

    public long getTokenExpiration() {
        return expiration;
    }

    public void setTokenExpiration(long expiration) {
        this.expiration = expiration;
    }

}
