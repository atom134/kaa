/*
 * Copyright 2014-2016 CyberVision, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

#ifndef Kaa_ConfigurationStorage_h
#define Kaa_ConfigurationStorage_h

#import <Foundation/Foundation.h>

@protocol ConfigurationStorage

/**
 * Stores configuration data.
 */
- (void)saveConfiguration:(NSData *)buffer;

/**
 * Removes previously stored configuration data.
 */
- (void)clearConfiguration;

/**
 * Loads last stored configuration data.
 */
- (NSData *)loadConfiguration;

@end

#endif